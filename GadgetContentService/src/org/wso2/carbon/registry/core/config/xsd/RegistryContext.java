
/**
 * RegistryContext.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.wso2.carbon.registry.core.config.xsd;
            

            /**
            *  RegistryContext bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class RegistryContext
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = RegistryContext
                Namespace URI = http://config.core.registry.carbon.wso2.org/xsd
                Namespace Prefix = ns77
                */
            

                        /**
                        * field for DBConfigNames
                        */

                        
                                    protected java.util.xsd.Iterator localDBConfigNames ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDBConfigNamesTracker = false ;

                           public boolean isDBConfigNamesSpecified(){
                               return localDBConfigNamesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.xsd.Iterator
                           */
                           public  java.util.xsd.Iterator getDBConfigNames(){
                               return localDBConfigNames;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DBConfigNames
                               */
                               public void setDBConfigNames(java.util.xsd.Iterator param){
                            localDBConfigNamesTracker = true;
                                   
                                            this.localDBConfigNames=param;
                                    

                               }
                            

                        /**
                        * field for BasePath
                        */

                        
                                    protected java.lang.String localBasePath ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBasePathTracker = false ;

                           public boolean isBasePathSpecified(){
                               return localBasePathTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getBasePath(){
                               return localBasePath;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BasePath
                               */
                               public void setBasePath(java.lang.String param){
                            localBasePathTracker = true;
                                   
                                            this.localBasePath=param;
                                    

                               }
                            

                        /**
                        * field for CacheEnabled
                        */

                        
                                    protected boolean localCacheEnabled ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCacheEnabledTracker = false ;

                           public boolean isCacheEnabledSpecified(){
                               return localCacheEnabledTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getCacheEnabled(){
                               return localCacheEnabled;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CacheEnabled
                               */
                               public void setCacheEnabled(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localCacheEnabledTracker =
                                       true;
                                   
                                            this.localCacheEnabled=param;
                                    

                               }
                            

                        /**
                        * field for Clone
                        */

                        
                                    protected boolean localClone ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCloneTracker = false ;

                           public boolean isCloneSpecified(){
                               return localCloneTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getClone(){
                               return localClone;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Clone
                               */
                               public void setClone(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localCloneTracker =
                                       true;
                                   
                                            this.localClone=param;
                                    

                               }
                            

                        /**
                        * field for CollectionMediaTypes
                        */

                        
                                    protected java.lang.String localCollectionMediaTypes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCollectionMediaTypesTracker = false ;

                           public boolean isCollectionMediaTypesSpecified(){
                               return localCollectionMediaTypesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCollectionMediaTypes(){
                               return localCollectionMediaTypes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CollectionMediaTypes
                               */
                               public void setCollectionMediaTypes(java.lang.String param){
                            localCollectionMediaTypesTracker = true;
                                   
                                            this.localCollectionMediaTypes=param;
                                    

                               }
                            

                        /**
                        * field for CustomEditManager
                        */

                        
                                    protected org.wso2.carbon.registry.core.jdbc.handlers.xsd.CustomEditManager localCustomEditManager ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustomEditManagerTracker = false ;

                           public boolean isCustomEditManagerSpecified(){
                               return localCustomEditManagerTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.registry.core.jdbc.handlers.xsd.CustomEditManager
                           */
                           public  org.wso2.carbon.registry.core.jdbc.handlers.xsd.CustomEditManager getCustomEditManager(){
                               return localCustomEditManager;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustomEditManager
                               */
                               public void setCustomEditManager(org.wso2.carbon.registry.core.jdbc.handlers.xsd.CustomEditManager param){
                            localCustomEditManagerTracker = true;
                                   
                                            this.localCustomEditManager=param;
                                    

                               }
                            

                        /**
                        * field for CustomUIMediaTypes
                        */

                        
                                    protected java.lang.String localCustomUIMediaTypes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustomUIMediaTypesTracker = false ;

                           public boolean isCustomUIMediaTypesSpecified(){
                               return localCustomUIMediaTypesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCustomUIMediaTypes(){
                               return localCustomUIMediaTypes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustomUIMediaTypes
                               */
                               public void setCustomUIMediaTypes(java.lang.String param){
                            localCustomUIMediaTypesTracker = true;
                                   
                                            this.localCustomUIMediaTypes=param;
                                    

                               }
                            

                        /**
                        * field for DataAccessManager
                        */

                        
                                    protected org.wso2.carbon.registry.core.dataaccess.xsd.DataAccessManager localDataAccessManager ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDataAccessManagerTracker = false ;

                           public boolean isDataAccessManagerSpecified(){
                               return localDataAccessManagerTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.registry.core.dataaccess.xsd.DataAccessManager
                           */
                           public  org.wso2.carbon.registry.core.dataaccess.xsd.DataAccessManager getDataAccessManager(){
                               return localDataAccessManager;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DataAccessManager
                               */
                               public void setDataAccessManager(org.wso2.carbon.registry.core.dataaccess.xsd.DataAccessManager param){
                            localDataAccessManagerTracker = true;
                                   
                                            this.localDataAccessManager=param;
                                    

                               }
                            

                        /**
                        * field for DefaultDataBaseConfiguration
                        */

                        
                                    protected org.wso2.carbon.registry.core.config.xsd.DataBaseConfiguration localDefaultDataBaseConfiguration ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDefaultDataBaseConfigurationTracker = false ;

                           public boolean isDefaultDataBaseConfigurationSpecified(){
                               return localDefaultDataBaseConfigurationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.registry.core.config.xsd.DataBaseConfiguration
                           */
                           public  org.wso2.carbon.registry.core.config.xsd.DataBaseConfiguration getDefaultDataBaseConfiguration(){
                               return localDefaultDataBaseConfiguration;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DefaultDataBaseConfiguration
                               */
                               public void setDefaultDataBaseConfiguration(org.wso2.carbon.registry.core.config.xsd.DataBaseConfiguration param){
                            localDefaultDataBaseConfigurationTracker = true;
                                   
                                            this.localDefaultDataBaseConfiguration=param;
                                    

                               }
                            

                        /**
                        * field for EmbeddedRegistryService
                        */

                        
                                    protected org.wso2.carbon.registry.core.jdbc.xsd.EmbeddedRegistryService localEmbeddedRegistryService ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEmbeddedRegistryServiceTracker = false ;

                           public boolean isEmbeddedRegistryServiceSpecified(){
                               return localEmbeddedRegistryServiceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.registry.core.jdbc.xsd.EmbeddedRegistryService
                           */
                           public  org.wso2.carbon.registry.core.jdbc.xsd.EmbeddedRegistryService getEmbeddedRegistryService(){
                               return localEmbeddedRegistryService;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EmbeddedRegistryService
                               */
                               public void setEmbeddedRegistryService(org.wso2.carbon.registry.core.jdbc.xsd.EmbeddedRegistryService param){
                            localEmbeddedRegistryServiceTracker = true;
                                   
                                            this.localEmbeddedRegistryService=param;
                                    

                               }
                            

                        /**
                        * field for HandlerConfigurations
                        */

                        
                                    protected java.lang.Object localHandlerConfigurations ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHandlerConfigurationsTracker = false ;

                           public boolean isHandlerConfigurationsSpecified(){
                               return localHandlerConfigurationsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.Object
                           */
                           public  java.lang.Object getHandlerConfigurations(){
                               return localHandlerConfigurations;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HandlerConfigurations
                               */
                               public void setHandlerConfigurations(java.lang.Object param){
                            localHandlerConfigurationsTracker = true;
                                   
                                            this.localHandlerConfigurations=param;
                                    

                               }
                            

                        /**
                        * field for HandlerManager
                        */

                        
                                    protected org.wso2.carbon.registry.core.jdbc.handlers.xsd.HandlerManager localHandlerManager ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHandlerManagerTracker = false ;

                           public boolean isHandlerManagerSpecified(){
                               return localHandlerManagerTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.registry.core.jdbc.handlers.xsd.HandlerManager
                           */
                           public  org.wso2.carbon.registry.core.jdbc.handlers.xsd.HandlerManager getHandlerManager(){
                               return localHandlerManager;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HandlerManager
                               */
                               public void setHandlerManager(org.wso2.carbon.registry.core.jdbc.handlers.xsd.HandlerManager param){
                            localHandlerManagerTracker = true;
                                   
                                            this.localHandlerManager=param;
                                    

                               }
                            

                        /**
                        * field for JdbcDir
                        */

                        
                                    protected org.apache.lucene.store.jdbc.xsd.JdbcDirectory localJdbcDir ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localJdbcDirTracker = false ;

                           public boolean isJdbcDirSpecified(){
                               return localJdbcDirTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.apache.lucene.store.jdbc.xsd.JdbcDirectory
                           */
                           public  org.apache.lucene.store.jdbc.xsd.JdbcDirectory getJdbcDir(){
                               return localJdbcDir;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param JdbcDir
                               */
                               public void setJdbcDir(org.apache.lucene.store.jdbc.xsd.JdbcDirectory param){
                            localJdbcDirTracker = true;
                                   
                                            this.localJdbcDir=param;
                                    

                               }
                            

                        /**
                        * field for LogWriter
                        */

                        
                                    protected org.wso2.carbon.registry.core.utils.xsd.LogWriter localLogWriter ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLogWriterTracker = false ;

                           public boolean isLogWriterSpecified(){
                               return localLogWriterTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.registry.core.utils.xsd.LogWriter
                           */
                           public  org.wso2.carbon.registry.core.utils.xsd.LogWriter getLogWriter(){
                               return localLogWriter;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LogWriter
                               */
                               public void setLogWriter(org.wso2.carbon.registry.core.utils.xsd.LogWriter param){
                            localLogWriterTracker = true;
                                   
                                            this.localLogWriter=param;
                                    

                               }
                            

                        /**
                        * field for MaxCache
                        */

                        
                                    protected int localMaxCache ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMaxCacheTracker = false ;

                           public boolean isMaxCacheSpecified(){
                               return localMaxCacheTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getMaxCache(){
                               return localMaxCache;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MaxCache
                               */
                               public void setMaxCache(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localMaxCacheTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localMaxCache=param;
                                    

                               }
                            

                        /**
                        * field for MediaTypeHandlers
                        */

                        
                                    protected java.lang.Object localMediaTypeHandlers ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMediaTypeHandlersTracker = false ;

                           public boolean isMediaTypeHandlersSpecified(){
                               return localMediaTypeHandlersTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.Object
                           */
                           public  java.lang.Object getMediaTypeHandlers(){
                               return localMediaTypeHandlers;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MediaTypeHandlers
                               */
                               public void setMediaTypeHandlers(java.lang.Object param){
                            localMediaTypeHandlersTracker = true;
                                   
                                            this.localMediaTypeHandlers=param;
                                    

                               }
                            

                        /**
                        * field for Mounts
                        */

                        
                                    protected java.lang.Object localMounts ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMountsTracker = false ;

                           public boolean isMountsSpecified(){
                               return localMountsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.Object
                           */
                           public  java.lang.Object getMounts(){
                               return localMounts;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Mounts
                               */
                               public void setMounts(java.lang.Object param){
                            localMountsTracker = true;
                                   
                                            this.localMounts=param;
                                    

                               }
                            

                        /**
                        * field for NodeIdentifier
                        */

                        
                                    protected java.lang.String localNodeIdentifier ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNodeIdentifierTracker = false ;

                           public boolean isNodeIdentifierSpecified(){
                               return localNodeIdentifierTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNodeIdentifier(){
                               return localNodeIdentifier;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NodeIdentifier
                               */
                               public void setNodeIdentifier(java.lang.String param){
                            localNodeIdentifierTracker = true;
                                   
                                            this.localNodeIdentifier=param;
                                    

                               }
                            

                        /**
                        * field for ProfilesPath
                        */

                        
                                    protected java.lang.String localProfilesPath ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProfilesPathTracker = false ;

                           public boolean isProfilesPathSpecified(){
                               return localProfilesPathTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getProfilesPath(){
                               return localProfilesPath;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProfilesPath
                               */
                               public void setProfilesPath(java.lang.String param){
                            localProfilesPathTracker = true;
                                   
                                            this.localProfilesPath=param;
                                    

                               }
                            

                        /**
                        * field for QueryProcessorManager
                        */

                        
                                    protected org.wso2.carbon.registry.core.jdbc.queries.xsd.QueryProcessorManager localQueryProcessorManager ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQueryProcessorManagerTracker = false ;

                           public boolean isQueryProcessorManagerSpecified(){
                               return localQueryProcessorManagerTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.registry.core.jdbc.queries.xsd.QueryProcessorManager
                           */
                           public  org.wso2.carbon.registry.core.jdbc.queries.xsd.QueryProcessorManager getQueryProcessorManager(){
                               return localQueryProcessorManager;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QueryProcessorManager
                               */
                               public void setQueryProcessorManager(org.wso2.carbon.registry.core.jdbc.queries.xsd.QueryProcessorManager param){
                            localQueryProcessorManagerTracker = true;
                                   
                                            this.localQueryProcessorManager=param;
                                    

                               }
                            

                        /**
                        * field for QueryProcessors
                        */

                        
                                    protected java.lang.Object localQueryProcessors ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQueryProcessorsTracker = false ;

                           public boolean isQueryProcessorsSpecified(){
                               return localQueryProcessorsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.Object
                           */
                           public  java.lang.Object getQueryProcessors(){
                               return localQueryProcessors;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QueryProcessors
                               */
                               public void setQueryProcessors(java.lang.Object param){
                            localQueryProcessorsTracker = true;
                                   
                                            this.localQueryProcessors=param;
                                    

                               }
                            

                        /**
                        * field for ReadOnly
                        */

                        
                                    protected boolean localReadOnly ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReadOnlyTracker = false ;

                           public boolean isReadOnlySpecified(){
                               return localReadOnlyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getReadOnly(){
                               return localReadOnly;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReadOnly
                               */
                               public void setReadOnly(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localReadOnlyTracker =
                                       true;
                                   
                                            this.localReadOnly=param;
                                    

                               }
                            

                        /**
                        * field for RealmService
                        */

                        
                                    protected org.wso2.carbon.user.core.service.xsd.RealmService localRealmService ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRealmServiceTracker = false ;

                           public boolean isRealmServiceSpecified(){
                               return localRealmServiceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.user.core.service.xsd.RealmService
                           */
                           public  org.wso2.carbon.user.core.service.xsd.RealmService getRealmService(){
                               return localRealmService;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RealmService
                               */
                               public void setRealmService(org.wso2.carbon.user.core.service.xsd.RealmService param){
                            localRealmServiceTracker = true;
                                   
                                            this.localRealmService=param;
                                    

                               }
                            

                        /**
                        * field for RegistryRoot
                        */

                        
                                    protected java.lang.String localRegistryRoot ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRegistryRootTracker = false ;

                           public boolean isRegistryRootSpecified(){
                               return localRegistryRootTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRegistryRoot(){
                               return localRegistryRoot;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RegistryRoot
                               */
                               public void setRegistryRoot(java.lang.String param){
                            localRegistryRootTracker = true;
                                   
                                            this.localRegistryRoot=param;
                                    

                               }
                            

                        /**
                        * field for RemoteInstances
                        */

                        
                                    protected java.lang.Object localRemoteInstances ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRemoteInstancesTracker = false ;

                           public boolean isRemoteInstancesSpecified(){
                               return localRemoteInstancesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.Object
                           */
                           public  java.lang.Object getRemoteInstances(){
                               return localRemoteInstances;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RemoteInstances
                               */
                               public void setRemoteInstances(java.lang.Object param){
                            localRemoteInstancesTracker = true;
                                   
                                            this.localRemoteInstances=param;
                                    

                               }
                            

                        /**
                        * field for Repository
                        */

                        
                                    protected org.wso2.carbon.registry.core.jdbc.xsd.Repository localRepository ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRepositoryTracker = false ;

                           public boolean isRepositorySpecified(){
                               return localRepositoryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.registry.core.jdbc.xsd.Repository
                           */
                           public  org.wso2.carbon.registry.core.jdbc.xsd.Repository getRepository(){
                               return localRepository;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Repository
                               */
                               public void setRepository(org.wso2.carbon.registry.core.jdbc.xsd.Repository param){
                            localRepositoryTracker = true;
                                   
                                            this.localRepository=param;
                                    

                               }
                            

                        /**
                        * field for ResourceMediaTypes
                        */

                        
                                    protected java.lang.String localResourceMediaTypes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResourceMediaTypesTracker = false ;

                           public boolean isResourceMediaTypesSpecified(){
                               return localResourceMediaTypesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getResourceMediaTypes(){
                               return localResourceMediaTypes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResourceMediaTypes
                               */
                               public void setResourceMediaTypes(java.lang.String param){
                            localResourceMediaTypesTracker = true;
                                   
                                            this.localResourceMediaTypes=param;
                                    

                               }
                            

                        /**
                        * field for ServicePath
                        */

                        
                                    protected java.lang.String localServicePath ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServicePathTracker = false ;

                           public boolean isServicePathSpecified(){
                               return localServicePathTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getServicePath(){
                               return localServicePath;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServicePath
                               */
                               public void setServicePath(java.lang.String param){
                            localServicePathTracker = true;
                                   
                                            this.localServicePath=param;
                                    

                               }
                            

                        /**
                        * field for Setup
                        */

                        
                                    protected boolean localSetup ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSetupTracker = false ;

                           public boolean isSetupSpecified(){
                               return localSetupTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getSetup(){
                               return localSetup;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Setup
                               */
                               public void setSetup(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localSetupTracker =
                                       true;
                                   
                                            this.localSetup=param;
                                    

                               }
                            

                        /**
                        * field for UrlHandlers
                        */

                        
                                    protected java.lang.Object localUrlHandlers ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUrlHandlersTracker = false ;

                           public boolean isUrlHandlersSpecified(){
                               return localUrlHandlersTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.Object
                           */
                           public  java.lang.Object getUrlHandlers(){
                               return localUrlHandlers;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UrlHandlers
                               */
                               public void setUrlHandlers(java.lang.Object param){
                            localUrlHandlersTracker = true;
                                   
                                            this.localUrlHandlers=param;
                                    

                               }
                            

                        /**
                        * field for VersionOnChange
                        */

                        
                                    protected boolean localVersionOnChange ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVersionOnChangeTracker = false ;

                           public boolean isVersionOnChangeSpecified(){
                               return localVersionOnChangeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getVersionOnChange(){
                               return localVersionOnChange;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param VersionOnChange
                               */
                               public void setVersionOnChange(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localVersionOnChangeTracker =
                                       true;
                                   
                                            this.localVersionOnChange=param;
                                    

                               }
                            

                        /**
                        * field for VersionRepository
                        */

                        
                                    protected org.wso2.carbon.registry.core.jdbc.xsd.VersionRepository localVersionRepository ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVersionRepositoryTracker = false ;

                           public boolean isVersionRepositorySpecified(){
                               return localVersionRepositoryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.registry.core.jdbc.xsd.VersionRepository
                           */
                           public  org.wso2.carbon.registry.core.jdbc.xsd.VersionRepository getVersionRepository(){
                               return localVersionRepository;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param VersionRepository
                               */
                               public void setVersionRepository(org.wso2.carbon.registry.core.jdbc.xsd.VersionRepository param){
                            localVersionRepositoryTracker = true;
                                   
                                            this.localVersionRepository=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://config.core.registry.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":RegistryContext",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "RegistryContext",
                           xmlWriter);
                   }

               
                   }
                if (localDBConfigNamesTracker){
                                    if (localDBConfigNames==null){

                                        writeStartElement(null, "http://config.core.registry.carbon.wso2.org/xsd", "DBConfigNames", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDBConfigNames.serialize(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","DBConfigNames"),
                                        xmlWriter);
                                    }
                                } if (localBasePathTracker){
                                    namespace = "http://config.core.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "basePath", xmlWriter);
                             

                                          if (localBasePath==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localBasePath);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCacheEnabledTracker){
                                    namespace = "http://config.core.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "cacheEnabled", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("cacheEnabled cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCacheEnabled));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCloneTracker){
                                    namespace = "http://config.core.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "clone", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("clone cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClone));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCollectionMediaTypesTracker){
                                    namespace = "http://config.core.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "collectionMediaTypes", xmlWriter);
                             

                                          if (localCollectionMediaTypes==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCollectionMediaTypes);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCustomEditManagerTracker){
                                    if (localCustomEditManager==null){

                                        writeStartElement(null, "http://config.core.registry.carbon.wso2.org/xsd", "customEditManager", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustomEditManager.serialize(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","customEditManager"),
                                        xmlWriter);
                                    }
                                } if (localCustomUIMediaTypesTracker){
                                    namespace = "http://config.core.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "customUIMediaTypes", xmlWriter);
                             

                                          if (localCustomUIMediaTypes==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCustomUIMediaTypes);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDataAccessManagerTracker){
                                    if (localDataAccessManager==null){

                                        writeStartElement(null, "http://config.core.registry.carbon.wso2.org/xsd", "dataAccessManager", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDataAccessManager.serialize(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","dataAccessManager"),
                                        xmlWriter);
                                    }
                                } if (localDefaultDataBaseConfigurationTracker){
                                    if (localDefaultDataBaseConfiguration==null){

                                        writeStartElement(null, "http://config.core.registry.carbon.wso2.org/xsd", "defaultDataBaseConfiguration", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDefaultDataBaseConfiguration.serialize(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","defaultDataBaseConfiguration"),
                                        xmlWriter);
                                    }
                                } if (localEmbeddedRegistryServiceTracker){
                                    if (localEmbeddedRegistryService==null){

                                        writeStartElement(null, "http://config.core.registry.carbon.wso2.org/xsd", "embeddedRegistryService", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localEmbeddedRegistryService.serialize(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","embeddedRegistryService"),
                                        xmlWriter);
                                    }
                                } if (localHandlerConfigurationsTracker){
                            
                            if (localHandlerConfigurations!=null){
                                if (localHandlerConfigurations instanceof org.apache.axis2.databinding.ADBBean){
                                    ((org.apache.axis2.databinding.ADBBean)localHandlerConfigurations).serialize(
                                               new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","handlerConfigurations"),
                                               xmlWriter,true);
                                 } else {
                                    writeStartElement(null, "http://config.core.registry.carbon.wso2.org/xsd", "handlerConfigurations", xmlWriter);
                                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localHandlerConfigurations, xmlWriter);
                                    xmlWriter.writeEndElement();
                                 }
                            } else {
                                
                                        // write null attribute
                                           writeStartElement(null, "http://config.core.registry.carbon.wso2.org/xsd", "handlerConfigurations", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                            }


                        } if (localHandlerManagerTracker){
                                    if (localHandlerManager==null){

                                        writeStartElement(null, "http://config.core.registry.carbon.wso2.org/xsd", "handlerManager", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localHandlerManager.serialize(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","handlerManager"),
                                        xmlWriter);
                                    }
                                } if (localJdbcDirTracker){
                                    if (localJdbcDir==null){

                                        writeStartElement(null, "http://config.core.registry.carbon.wso2.org/xsd", "jdbcDir", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localJdbcDir.serialize(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","jdbcDir"),
                                        xmlWriter);
                                    }
                                } if (localLogWriterTracker){
                                    if (localLogWriter==null){

                                        writeStartElement(null, "http://config.core.registry.carbon.wso2.org/xsd", "logWriter", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLogWriter.serialize(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","logWriter"),
                                        xmlWriter);
                                    }
                                } if (localMaxCacheTracker){
                                    namespace = "http://config.core.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "maxCache", xmlWriter);
                             
                                               if (localMaxCache==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("maxCache cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxCache));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMediaTypeHandlersTracker){
                            
                            if (localMediaTypeHandlers!=null){
                                if (localMediaTypeHandlers instanceof org.apache.axis2.databinding.ADBBean){
                                    ((org.apache.axis2.databinding.ADBBean)localMediaTypeHandlers).serialize(
                                               new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","mediaTypeHandlers"),
                                               xmlWriter,true);
                                 } else {
                                    writeStartElement(null, "http://config.core.registry.carbon.wso2.org/xsd", "mediaTypeHandlers", xmlWriter);
                                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localMediaTypeHandlers, xmlWriter);
                                    xmlWriter.writeEndElement();
                                 }
                            } else {
                                
                                        // write null attribute
                                           writeStartElement(null, "http://config.core.registry.carbon.wso2.org/xsd", "mediaTypeHandlers", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                            }


                        } if (localMountsTracker){
                            
                            if (localMounts!=null){
                                if (localMounts instanceof org.apache.axis2.databinding.ADBBean){
                                    ((org.apache.axis2.databinding.ADBBean)localMounts).serialize(
                                               new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","mounts"),
                                               xmlWriter,true);
                                 } else {
                                    writeStartElement(null, "http://config.core.registry.carbon.wso2.org/xsd", "mounts", xmlWriter);
                                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localMounts, xmlWriter);
                                    xmlWriter.writeEndElement();
                                 }
                            } else {
                                
                                        // write null attribute
                                           writeStartElement(null, "http://config.core.registry.carbon.wso2.org/xsd", "mounts", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                            }


                        } if (localNodeIdentifierTracker){
                                    namespace = "http://config.core.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "nodeIdentifier", xmlWriter);
                             

                                          if (localNodeIdentifier==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localNodeIdentifier);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localProfilesPathTracker){
                                    namespace = "http://config.core.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "profilesPath", xmlWriter);
                             

                                          if (localProfilesPath==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localProfilesPath);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localQueryProcessorManagerTracker){
                                    if (localQueryProcessorManager==null){

                                        writeStartElement(null, "http://config.core.registry.carbon.wso2.org/xsd", "queryProcessorManager", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localQueryProcessorManager.serialize(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","queryProcessorManager"),
                                        xmlWriter);
                                    }
                                } if (localQueryProcessorsTracker){
                            
                            if (localQueryProcessors!=null){
                                if (localQueryProcessors instanceof org.apache.axis2.databinding.ADBBean){
                                    ((org.apache.axis2.databinding.ADBBean)localQueryProcessors).serialize(
                                               new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","queryProcessors"),
                                               xmlWriter,true);
                                 } else {
                                    writeStartElement(null, "http://config.core.registry.carbon.wso2.org/xsd", "queryProcessors", xmlWriter);
                                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localQueryProcessors, xmlWriter);
                                    xmlWriter.writeEndElement();
                                 }
                            } else {
                                
                                        // write null attribute
                                           writeStartElement(null, "http://config.core.registry.carbon.wso2.org/xsd", "queryProcessors", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                            }


                        } if (localReadOnlyTracker){
                                    namespace = "http://config.core.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "readOnly", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("readOnly cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReadOnly));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRealmServiceTracker){
                                    if (localRealmService==null){

                                        writeStartElement(null, "http://config.core.registry.carbon.wso2.org/xsd", "realmService", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRealmService.serialize(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","realmService"),
                                        xmlWriter);
                                    }
                                } if (localRegistryRootTracker){
                                    namespace = "http://config.core.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "registryRoot", xmlWriter);
                             

                                          if (localRegistryRoot==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRegistryRoot);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRemoteInstancesTracker){
                            
                            if (localRemoteInstances!=null){
                                if (localRemoteInstances instanceof org.apache.axis2.databinding.ADBBean){
                                    ((org.apache.axis2.databinding.ADBBean)localRemoteInstances).serialize(
                                               new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","remoteInstances"),
                                               xmlWriter,true);
                                 } else {
                                    writeStartElement(null, "http://config.core.registry.carbon.wso2.org/xsd", "remoteInstances", xmlWriter);
                                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localRemoteInstances, xmlWriter);
                                    xmlWriter.writeEndElement();
                                 }
                            } else {
                                
                                        // write null attribute
                                           writeStartElement(null, "http://config.core.registry.carbon.wso2.org/xsd", "remoteInstances", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                            }


                        } if (localRepositoryTracker){
                                    if (localRepository==null){

                                        writeStartElement(null, "http://config.core.registry.carbon.wso2.org/xsd", "repository", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRepository.serialize(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","repository"),
                                        xmlWriter);
                                    }
                                } if (localResourceMediaTypesTracker){
                                    namespace = "http://config.core.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "resourceMediaTypes", xmlWriter);
                             

                                          if (localResourceMediaTypes==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localResourceMediaTypes);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localServicePathTracker){
                                    namespace = "http://config.core.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "servicePath", xmlWriter);
                             

                                          if (localServicePath==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localServicePath);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSetupTracker){
                                    namespace = "http://config.core.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "setup", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("setup cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSetup));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUrlHandlersTracker){
                            
                            if (localUrlHandlers!=null){
                                if (localUrlHandlers instanceof org.apache.axis2.databinding.ADBBean){
                                    ((org.apache.axis2.databinding.ADBBean)localUrlHandlers).serialize(
                                               new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","urlHandlers"),
                                               xmlWriter,true);
                                 } else {
                                    writeStartElement(null, "http://config.core.registry.carbon.wso2.org/xsd", "urlHandlers", xmlWriter);
                                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localUrlHandlers, xmlWriter);
                                    xmlWriter.writeEndElement();
                                 }
                            } else {
                                
                                        // write null attribute
                                           writeStartElement(null, "http://config.core.registry.carbon.wso2.org/xsd", "urlHandlers", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                            }


                        } if (localVersionOnChangeTracker){
                                    namespace = "http://config.core.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "versionOnChange", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("versionOnChange cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVersionOnChange));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localVersionRepositoryTracker){
                                    if (localVersionRepository==null){

                                        writeStartElement(null, "http://config.core.registry.carbon.wso2.org/xsd", "versionRepository", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localVersionRepository.serialize(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","versionRepository"),
                                        xmlWriter);
                                    }
                                }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://config.core.registry.carbon.wso2.org/xsd")){
                return "ns77";
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

                 if (localDBConfigNamesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "DBConfigNames"));
                            
                            
                                    elementList.add(localDBConfigNames==null?null:
                                    localDBConfigNames);
                                } if (localBasePathTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "basePath"));
                                 
                                         elementList.add(localBasePath==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBasePath));
                                    } if (localCacheEnabledTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "cacheEnabled"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCacheEnabled));
                            } if (localCloneTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "clone"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClone));
                            } if (localCollectionMediaTypesTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "collectionMediaTypes"));
                                 
                                         elementList.add(localCollectionMediaTypes==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCollectionMediaTypes));
                                    } if (localCustomEditManagerTracker){
                            elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "customEditManager"));
                            
                            
                                    elementList.add(localCustomEditManager==null?null:
                                    localCustomEditManager);
                                } if (localCustomUIMediaTypesTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "customUIMediaTypes"));
                                 
                                         elementList.add(localCustomUIMediaTypes==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCustomUIMediaTypes));
                                    } if (localDataAccessManagerTracker){
                            elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "dataAccessManager"));
                            
                            
                                    elementList.add(localDataAccessManager==null?null:
                                    localDataAccessManager);
                                } if (localDefaultDataBaseConfigurationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "defaultDataBaseConfiguration"));
                            
                            
                                    elementList.add(localDefaultDataBaseConfiguration==null?null:
                                    localDefaultDataBaseConfiguration);
                                } if (localEmbeddedRegistryServiceTracker){
                            elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "embeddedRegistryService"));
                            
                            
                                    elementList.add(localEmbeddedRegistryService==null?null:
                                    localEmbeddedRegistryService);
                                } if (localHandlerConfigurationsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "handlerConfigurations"));
                            
                            
                                    elementList.add(localHandlerConfigurations==null?null:
                                    localHandlerConfigurations);
                                } if (localHandlerManagerTracker){
                            elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "handlerManager"));
                            
                            
                                    elementList.add(localHandlerManager==null?null:
                                    localHandlerManager);
                                } if (localJdbcDirTracker){
                            elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "jdbcDir"));
                            
                            
                                    elementList.add(localJdbcDir==null?null:
                                    localJdbcDir);
                                } if (localLogWriterTracker){
                            elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "logWriter"));
                            
                            
                                    elementList.add(localLogWriter==null?null:
                                    localLogWriter);
                                } if (localMaxCacheTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "maxCache"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxCache));
                            } if (localMediaTypeHandlersTracker){
                            elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "mediaTypeHandlers"));
                            
                            
                                    elementList.add(localMediaTypeHandlers==null?null:
                                    localMediaTypeHandlers);
                                } if (localMountsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "mounts"));
                            
                            
                                    elementList.add(localMounts==null?null:
                                    localMounts);
                                } if (localNodeIdentifierTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "nodeIdentifier"));
                                 
                                         elementList.add(localNodeIdentifier==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNodeIdentifier));
                                    } if (localProfilesPathTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "profilesPath"));
                                 
                                         elementList.add(localProfilesPath==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProfilesPath));
                                    } if (localQueryProcessorManagerTracker){
                            elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "queryProcessorManager"));
                            
                            
                                    elementList.add(localQueryProcessorManager==null?null:
                                    localQueryProcessorManager);
                                } if (localQueryProcessorsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "queryProcessors"));
                            
                            
                                    elementList.add(localQueryProcessors==null?null:
                                    localQueryProcessors);
                                } if (localReadOnlyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "readOnly"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReadOnly));
                            } if (localRealmServiceTracker){
                            elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "realmService"));
                            
                            
                                    elementList.add(localRealmService==null?null:
                                    localRealmService);
                                } if (localRegistryRootTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "registryRoot"));
                                 
                                         elementList.add(localRegistryRoot==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRegistryRoot));
                                    } if (localRemoteInstancesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "remoteInstances"));
                            
                            
                                    elementList.add(localRemoteInstances==null?null:
                                    localRemoteInstances);
                                } if (localRepositoryTracker){
                            elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "repository"));
                            
                            
                                    elementList.add(localRepository==null?null:
                                    localRepository);
                                } if (localResourceMediaTypesTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "resourceMediaTypes"));
                                 
                                         elementList.add(localResourceMediaTypes==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResourceMediaTypes));
                                    } if (localServicePathTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "servicePath"));
                                 
                                         elementList.add(localServicePath==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServicePath));
                                    } if (localSetupTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "setup"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSetup));
                            } if (localUrlHandlersTracker){
                            elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "urlHandlers"));
                            
                            
                                    elementList.add(localUrlHandlers==null?null:
                                    localUrlHandlers);
                                } if (localVersionOnChangeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "versionOnChange"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVersionOnChange));
                            } if (localVersionRepositoryTracker){
                            elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "versionRepository"));
                            
                            
                                    elementList.add(localVersionRepository==null?null:
                                    localVersionRepository);
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
        public static RegistryContext parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            RegistryContext object =
                new RegistryContext();

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
                    
                            if (!"RegistryContext".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (RegistryContext)org.wso2.carbon.registry.core.jdbc.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","DBConfigNames").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDBConfigNames(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDBConfigNames(java.util.xsd.Iterator.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","basePath").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBasePath(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","cacheEnabled").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"cacheEnabled" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCacheEnabled(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","clone").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"clone" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClone(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","collectionMediaTypes").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCollectionMediaTypes(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","customEditManager").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustomEditManager(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustomEditManager(org.wso2.carbon.registry.core.jdbc.handlers.xsd.CustomEditManager.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","customUIMediaTypes").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCustomUIMediaTypes(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","dataAccessManager").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDataAccessManager(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDataAccessManager(org.wso2.carbon.registry.core.dataaccess.xsd.DataAccessManager.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","defaultDataBaseConfiguration").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDefaultDataBaseConfiguration(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDefaultDataBaseConfiguration(org.wso2.carbon.registry.core.config.xsd.DataBaseConfiguration.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","embeddedRegistryService").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setEmbeddedRegistryService(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setEmbeddedRegistryService(org.wso2.carbon.registry.core.jdbc.xsd.EmbeddedRegistryService.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","handlerConfigurations").equals(reader.getName())){
                                
                                     object.setHandlerConfigurations(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(reader,
                                                org.wso2.carbon.registry.core.jdbc.xsd.ExtensionMapper.class));
                                       
                                         reader.next();
                                     
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","handlerManager").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setHandlerManager(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setHandlerManager(org.wso2.carbon.registry.core.jdbc.handlers.xsd.HandlerManager.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","jdbcDir").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setJdbcDir(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setJdbcDir(org.apache.lucene.store.jdbc.xsd.JdbcDirectory.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","logWriter").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLogWriter(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLogWriter(org.wso2.carbon.registry.core.utils.xsd.LogWriter.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","maxCache").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"maxCache" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMaxCache(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setMaxCache(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","mediaTypeHandlers").equals(reader.getName())){
                                
                                     object.setMediaTypeHandlers(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(reader,
                                                org.wso2.carbon.registry.core.jdbc.xsd.ExtensionMapper.class));
                                       
                                         reader.next();
                                     
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","mounts").equals(reader.getName())){
                                
                                     object.setMounts(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(reader,
                                                org.wso2.carbon.registry.core.jdbc.xsd.ExtensionMapper.class));
                                       
                                         reader.next();
                                     
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","nodeIdentifier").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNodeIdentifier(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","profilesPath").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setProfilesPath(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","queryProcessorManager").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setQueryProcessorManager(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setQueryProcessorManager(org.wso2.carbon.registry.core.jdbc.queries.xsd.QueryProcessorManager.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","queryProcessors").equals(reader.getName())){
                                
                                     object.setQueryProcessors(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(reader,
                                                org.wso2.carbon.registry.core.jdbc.xsd.ExtensionMapper.class));
                                       
                                         reader.next();
                                     
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","readOnly").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"readOnly" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReadOnly(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","realmService").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRealmService(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRealmService(org.wso2.carbon.user.core.service.xsd.RealmService.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","registryRoot").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRegistryRoot(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","remoteInstances").equals(reader.getName())){
                                
                                     object.setRemoteInstances(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(reader,
                                                org.wso2.carbon.registry.core.jdbc.xsd.ExtensionMapper.class));
                                       
                                         reader.next();
                                     
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","repository").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRepository(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRepository(org.wso2.carbon.registry.core.jdbc.xsd.Repository.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","resourceMediaTypes").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setResourceMediaTypes(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","servicePath").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServicePath(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","setup").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"setup" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSetup(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","urlHandlers").equals(reader.getName())){
                                
                                     object.setUrlHandlers(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(reader,
                                                org.wso2.carbon.registry.core.jdbc.xsd.ExtensionMapper.class));
                                       
                                         reader.next();
                                     
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","versionOnChange").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"versionOnChange" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setVersionOnChange(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","versionRepository").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setVersionRepository(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setVersionRepository(org.wso2.carbon.registry.core.jdbc.xsd.VersionRepository.Factory.parse(reader));
                                              
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
           
    
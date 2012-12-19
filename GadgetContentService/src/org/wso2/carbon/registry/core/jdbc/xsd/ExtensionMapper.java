
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package org.wso2.carbon.registry.core.jdbc.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://core.user.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "UserStoreManager".equals(typeName)){
                   
                            return  org.wso2.carbon.user.core.xsd.UserStoreManager.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://multitenancy.config.core.user.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "MultiTenantRealmConfigBuilder".equals(typeName)){
                   
                            return  org.wso2.carbon.user.core.config.multitenancy.xsd.MultiTenantRealmConfigBuilder.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dataaccess.core.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "DAOManager".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.core.dataaccess.xsd.DAOManager.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://handlers.jdbc.core.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "CustomEditManager".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.core.jdbc.handlers.xsd.CustomEditManager.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dataaccess.core.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "DatabaseTransaction".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.core.dataaccess.xsd.DatabaseTransaction.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://securevault.wso2.org/xsd".equals(namespaceURI) &&
                  "SecretResolver".equals(typeName)){
                   
                            return  org.wso2.securevault.xsd.SecretResolver.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dao.core.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ResourceVersionDAO".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.core.dao.xsd.ResourceVersionDAO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://util.java/xsd".equals(namespaceURI) &&
                  "Properties".equals(typeName)){
                   
                            return  java.util.xsd.Properties.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://claim.core.user.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ClaimManager".equals(typeName)){
                   
                            return  org.wso2.carbon.user.core.claim.xsd.ClaimManager.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://jdbc.core.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "EmbeddedRegistryService".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.core.jdbc.xsd.EmbeddedRegistryService.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dao.core.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "LogsDAO".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.core.dao.xsd.LogsDAO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://utils.core.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "LogQueue".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.core.utils.xsd.LogQueue.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://support.jdbc.store.lucene.apache.org/xsd".equals(namespaceURI) &&
                  "JdbcColumn".equals(typeName)){
                   
                            return  org.apache.lucene.store.jdbc.support.xsd.JdbcColumn.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://support.jdbc.store.lucene.apache.org/xsd".equals(namespaceURI) &&
                  "JdbcTable".equals(typeName)){
                   
                            return  org.apache.lucene.store.jdbc.support.xsd.JdbcTable.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://queries.jdbc.core.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "QueryProcessorManager".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.core.jdbc.queries.xsd.QueryProcessorManager.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://core.user.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "AuthorizationManager".equals(typeName)){
                   
                            return  org.wso2.carbon.user.core.xsd.AuthorizationManager.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://session.core.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "UserRegistry".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.core.session.xsd.UserRegistry.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://store.lucene.apache.org/xsd".equals(namespaceURI) &&
                  "Directory".equals(typeName)){
                   
                            return  org.apache.lucene.store.xsd.Directory.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://util.java/xsd".equals(namespaceURI) &&
                  "Dictionary".equals(typeName)){
                   
                            return  java.util.xsd.Dictionary.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://framework.osgi.org/xsd".equals(namespaceURI) &&
                  "ServiceReference".equals(typeName)){
                   
                            return  org.osgi.framework.xsd.ServiceReference.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.resource.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ContentDownloadBean".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.resource.beans.xsd.ContentDownloadBean.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://service.core.user.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "RealmService".equals(typeName)){
                   
                            return  org.wso2.carbon.user.core.service.xsd.RealmService.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://core.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "Registry".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.core.xsd.Registry.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://config.core.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "RegistryContext".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.core.config.xsd.RegistryContext.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dataaccess.core.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "TransactionManager".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.core.dataaccess.xsd.TransactionManager.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "Registry".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.api.xsd.RegistryE.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://tenant.core.user.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "TenantManager".equals(typeName)){
                   
                            return  org.wso2.carbon.user.core.tenant.xsd.TenantManager.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://framework.osgi.org/xsd".equals(namespaceURI) &&
                  "Version".equals(typeName)){
                   
                            return  org.osgi.framework.xsd.Version.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://util.java/xsd".equals(namespaceURI) &&
                  "Map".equals(typeName)){
                   
                            return  java.util.xsd.Map.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dataaccess.core.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "QueryProcessor".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.core.dataaccess.xsd.QueryProcessor.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.user.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "RealmConfiguration".equals(typeName)){
                   
                            return  org.wso2.carbon.user.api.xsd.RealmConfiguration.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://org.wso2.wsf/tools".equals(namespaceURI) &&
                  "Exception".equals(typeName)){
                   
                            return  wsf.wso2.org.tools.Exception.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dialect.jdbc.store.lucene.apache.org/xsd".equals(namespaceURI) &&
                  "Dialect".equals(typeName)){
                   
                            return  org.apache.lucene.store.jdbc.dialect.xsd.Dialect.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://utils.core.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "LogWriter".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.core.utils.xsd.LogWriter.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dao.core.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "AssociationDAO".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.core.dao.xsd.AssociationDAO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dao.core.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ResourceDAO".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.core.dao.xsd.ResourceDAO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://jdbc.store.lucene.apache.org/xsd".equals(namespaceURI) &&
                  "JdbcDirectory".equals(typeName)){
                   
                            return  org.apache.lucene.store.jdbc.xsd.JdbcDirectory.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://handlers.jdbc.core.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "HandlerManager".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.core.jdbc.handlers.xsd.HandlerManager.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://config.core.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "DataBaseConfiguration".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.core.config.xsd.DataBaseConfiguration.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dataaccess.core.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ClusterLock".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.core.dataaccess.xsd.ClusterLock.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://support.jdbc.store.lucene.apache.org/xsd".equals(namespaceURI) &&
                  "JdbcTemplate".equals(typeName)){
                   
                            return  org.apache.lucene.store.jdbc.support.xsd.JdbcTemplate.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://framework.osgi.org/xsd".equals(namespaceURI) &&
                  "Bundle".equals(typeName)){
                   
                            return  org.osgi.framework.xsd.Bundle.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://util.java/xsd".equals(namespaceURI) &&
                  "Iterator".equals(typeName)){
                   
                            return  java.util.xsd.Iterator.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dataaccess.core.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "DataAccessManager".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.core.dataaccess.xsd.DataAccessManager.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://jdbc.store.lucene.apache.org/xsd".equals(namespaceURI) &&
                  "JdbcFileEntrySettings".equals(typeName)){
                   
                            return  org.apache.lucene.store.jdbc.xsd.JdbcFileEntrySettings.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://jdbc.store.lucene.apache.org/xsd".equals(namespaceURI) &&
                  "JdbcDirectorySettings".equals(typeName)){
                   
                            return  org.apache.lucene.store.jdbc.xsd.JdbcDirectorySettings.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://core.user.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "UserRealm".equals(typeName)){
                   
                            return  org.wso2.carbon.user.core.xsd.UserRealm.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://profile.core.user.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ProfileConfigurationManager".equals(typeName)){
                   
                            return  org.wso2.carbon.user.core.profile.xsd.ProfileConfigurationManager.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://jdbc.core.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "Repository".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.core.jdbc.xsd.Repository.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://framework.osgi.org/xsd".equals(namespaceURI) &&
                  "BundleContext".equals(typeName)){
                   
                            return  org.osgi.framework.xsd.BundleContext.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://jdbc.core.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "VersionRepository".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.core.jdbc.xsd.VersionRepository.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://store.lucene.apache.org/xsd".equals(namespaceURI) &&
                  "LockFactory".equals(typeName)){
                   
                            return  org.apache.lucene.store.xsd.LockFactory.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
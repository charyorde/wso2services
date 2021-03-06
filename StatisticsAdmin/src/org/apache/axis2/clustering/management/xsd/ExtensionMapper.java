
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package org.apache.axis2.clustering.management.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://util.services.statistics.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "SystemStatistics".equals(typeName)){
                   
                            return  org.wso2.carbon.statistics.services.util.xsd.SystemStatistics.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://engine.axis2.apache.org/xsd".equals(namespaceURI) &&
                  "AxisConfigurator".equals(typeName)){
                   
                            return  org.apache.axis2.engine.xsd.AxisConfigurator.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://util.axis2.apache.org/xsd".equals(namespaceURI) &&
                  "TargetResolver".equals(typeName)){
                   
                            return  org.apache.axis2.util.xsd.TargetResolver.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://description.axis2.apache.org/xsd".equals(namespaceURI) &&
                  "AxisService".equals(typeName)){
                   
                            return  org.apache.axis2.description.xsd.AxisService.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://util.java/xsd".equals(namespaceURI) &&
                  "Map".equals(typeName)){
                   
                            return  java.util.xsd.Map.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://description.axis2.apache.org/xsd".equals(namespaceURI) &&
                  "AxisServiceGroup".equals(typeName)){
                   
                            return  org.apache.axis2.description.xsd.AxisServiceGroup.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://util.services.statistics.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "OperationStatistics".equals(typeName)){
                   
                            return  org.wso2.carbon.statistics.services.util.xsd.OperationStatistics.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://description.axis2.apache.org/xsd".equals(namespaceURI) &&
                  "AxisOperation".equals(typeName)){
                   
                            return  org.apache.axis2.description.xsd.AxisOperation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://transaction.axis2.apache.org/xsd".equals(namespaceURI) &&
                  "TransactionConfiguration".equals(typeName)){
                   
                            return  org.apache.axis2.transaction.xsd.TransactionConfiguration.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://clustering.axis2.apache.org/xsd".equals(namespaceURI) &&
                  "ClusteringAgent".equals(typeName)){
                   
                            return  org.apache.axis2.clustering.xsd.ClusteringAgent.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://state.clustering.axis2.apache.org/xsd".equals(namespaceURI) &&
                  "StateManager".equals(typeName)){
                   
                            return  org.apache.axis2.clustering.state.xsd.StateManager.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://util.deployment.axis2.apache.org/xsd".equals(namespaceURI) &&
                  "ExcludeInfo".equals(typeName)){
                   
                            return  org.apache.axis2.deployment.util.xsd.ExcludeInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://util.deployment.axis2.apache.org/xsd".equals(namespaceURI) &&
                  "PhasesInfo".equals(typeName)){
                   
                            return  org.apache.axis2.deployment.util.xsd.PhasesInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://net.java/xsd".equals(namespaceURI) &&
                  "URL".equals(typeName)){
                   
                            return  java.net.xsd.URL.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://engine.axis2.apache.org/xsd".equals(namespaceURI) &&
                  "MessageReceiver".equals(typeName)){
                   
                            return  org.apache.axis2.engine.xsd.MessageReceiver.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://securevault.wso2.org/xsd".equals(namespaceURI) &&
                  "SecretResolver".equals(typeName)){
                   
                            return  org.wso2.securevault.xsd.SecretResolver.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://management.clustering.axis2.apache.org/xsd".equals(namespaceURI) &&
                  "NodeManager".equals(typeName)){
                   
                            return  org.apache.axis2.clustering.management.xsd.NodeManager.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://engine.axis2.apache.org/xsd".equals(namespaceURI) &&
                  "AxisConfiguration".equals(typeName)){
                   
                            return  org.apache.axis2.engine.xsd.AxisConfiguration.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://util.services.statistics.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ServiceStatistics".equals(typeName)){
                   
                            return  org.wso2.carbon.statistics.services.util.xsd.ServiceStatistics.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://context.axis2.apache.org/xsd".equals(namespaceURI) &&
                  "ConfigurationContext".equals(typeName)){
                   
                            return  org.apache.axis2.context.xsd.ConfigurationContext.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://java2wsdl.description.axis2.apache.org/xsd".equals(namespaceURI) &&
                  "TypeTable".equals(typeName)){
                   
                            return  org.apache.axis2.description.java2wsdl.xsd.TypeTable.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://threadpool.util.axis2.apache.org/xsd".equals(namespaceURI) &&
                  "ThreadFactory".equals(typeName)){
                   
                            return  org.apache.axis2.util.threadpool.xsd.ThreadFactory.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://util.java/xsd".equals(namespaceURI) &&
                  "Iterator".equals(typeName)){
                   
                            return  java.util.xsd.Iterator.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://engine.axis2.apache.org/xsd".equals(namespaceURI) &&
                  "ListenerManager".equals(typeName)){
                   
                            return  org.apache.axis2.engine.xsd.ListenerManager.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://util.java/xsd".equals(namespaceURI) &&
                  "Set".equals(typeName)){
                   
                            return  java.util.xsd.Set.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://util.services.statistics.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "Metric".equals(typeName)){
                   
                            return  org.wso2.carbon.statistics.services.util.xsd.Metric.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://engine.axis2.apache.org/xsd".equals(namespaceURI) &&
                  "ObjectSupplier".equals(typeName)){
                   
                            return  org.apache.axis2.engine.xsd.ObjectSupplier.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://engine.axis2.apache.org/xsd".equals(namespaceURI) &&
                  "ServiceLifeCycle".equals(typeName)){
                   
                            return  org.apache.axis2.engine.xsd.ServiceLifeCycle.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
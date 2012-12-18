
/**
 * BAMConfigurationDSSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.ws.dataservice;
    /**
     *  BAMConfigurationDSSkeletonInterface java skeleton interface for the axisService
     */
    public interface BAMConfigurationDSSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param getMessageDataForActivityKeyIDandMessageKeyID
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.MessagedatasE getMessageDataForActivityKeyIDandMessageKeyID
                (
                  org.wso2.carbon.bam.GetMessageDataForActivityKeyIDandMessageKeyID getMessageDataForActivityKeyIDandMessageKeyID
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getMessage
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.MessagesE getMessage
                (
                  org.wso2.carbon.bam.GetMessage getMessage
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addService
             * @throws DataServiceFaultException : 
         */

        
                public void addService
                (
                  org.wso2.ws.dataservice.AddService addService
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllServersWithCategory
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ServersWithCategoryE getAllServersWithCategory
                (
                  org.wso2.carbon.bam.GetAllServersWithCategory getAllServersWithCategory
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param deactivateServer
             * @throws DataServiceFaultException : 
         */

        
                public void deactivateServer
                (
                  org.wso2.ws.dataservice.DeactivateServer deactivateServer
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllOperationsForService
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.OperationsE getAllOperationsForService
                (
                  org.wso2.carbon.bam.GetAllOperationsForService getAllOperationsForService
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getServersForTenant
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ServersE getServersForTenant
                (
                  org.wso2.carbon.bam.GetServersForTenant getServersForTenant
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getOperationFromName
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.OperationsE getOperationFromName
                (
                  org.wso2.carbon.bam.GetOperationFromName getOperationFromName
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllMessagesForOperationID
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.MessagesE getAllMessagesForOperationID
                (
                  org.wso2.carbon.bam.GetAllMessagesForOperationID getAllMessagesForOperationID
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllOperations
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.OperationsE getAllOperations
                (
                  org.wso2.carbon.bam.GetAllOperations getAllOperations
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getMessageForMessageandOperationandActivity
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.MessagesE getMessageForMessageandOperationandActivity
                (
                  org.wso2.carbon.bam.GetMessageForMessageandOperationandActivity getMessageForMessageandOperationandActivity
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param deleteTenet
             * @throws DataServiceFaultException : 
         */

        
                public void deleteTenet
                (
                  org.wso2.ws.dataservice.DeleteTenet deleteTenet
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getEndpoints
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.EndpointsE getEndpoints
                (
                  org.wso2.carbon.bam.GetEndpoints getEndpoints
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getTenent
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.TenentsE getTenent
                (
                  org.wso2.carbon.bam.GetTenent getTenent
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllMessagesForActivityKeyId
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.MessagesE getAllMessagesForActivityKeyId
                (
                  org.wso2.carbon.bam.GetAllMessagesForActivityKeyId getAllMessagesForActivityKeyId
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getActivityForActivityID
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ActivitiesE getActivityForActivityID
                (
                  org.wso2.carbon.bam.GetActivityForActivityID getActivityForActivityID
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * This operation retrieves all xpath configurations from BAM_XPATH.
                                    * @param getAllXpathData
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.AllXpathsE getAllXpathData
                (
                  org.wso2.carbon.bam.GetAllXpathData getAllXpathData
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllServices
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ServicesE getAllServices
                (
                  org.wso2.carbon.bam.GetAllServices getAllServices
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * This operation adds data corresponds to a particular namespace.
                                    * @param addNamespaceData
             * @throws DataServiceFaultException : 
         */

        
                public void addNamespaceData
                (
                  org.wso2.ws.dataservice.AddNamespaceData addNamespaceData
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllServersWithCategoryForTenent
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ServersWithCategoryE getAllServersWithCategoryForTenent
                (
                  org.wso2.carbon.bam.GetAllServersWithCategoryForTenent getAllServersWithCategoryForTenent
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getServerFromURL
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ServersE getServerFromURL
                (
                  org.wso2.carbon.bam.GetServerFromURL getServerFromURL
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateMessageProperty
             * @throws DataServiceFaultException : 
         */

        
                public void updateMessageProperty
                (
                  org.wso2.ws.dataservice.UpdateMessageProperty updateMessageProperty
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getServersForServerType
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ServersE getServersForServerType
                (
                  org.wso2.carbon.bam.GetServersForServerType getServersForServerType
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * This operation retrieves BAM_ID, BAM_ALIAS, BAM_XPATH from the table BAM_XPATH corresponds to a given BAM_NAME and BAM_SERVER_ID.
                                    * @param selectXpathData
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.XpathsE selectXpathData
                (
                  org.wso2.carbon.bam.SelectXpathData selectXpathData
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getActivity
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ActivitiesE getActivity
                (
                  org.wso2.carbon.bam.GetActivity getActivity
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getServerFromURLAndTenantID
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ServersE getServerFromURLAndTenantID
                (
                  org.wso2.carbon.bam.GetServerFromURLAndTenantID getServerFromURLAndTenantID
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * This operation retrieves BAM_ID, BAM_PREFIX, BAM_URI associated with a particular BAM_XPATH_ID.
                                    * @param selectNamespaceData
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.NamespacesE selectNamespaceData
                (
                  org.wso2.carbon.bam.SelectNamespaceData selectNamespaceData
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllServers
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ServersE getAllServers
                (
                  org.wso2.carbon.bam.GetAllServers getAllServers
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addTenent
             * @throws DataServiceFaultException : 
         */

        
                public void addTenent
                (
                  org.wso2.ws.dataservice.AddTenent addTenent
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addOperation
             * @throws DataServiceFaultException : 
         */

        
                public void addOperation
                (
                  org.wso2.ws.dataservice.AddOperation addOperation
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param activateServer
             * @throws DataServiceFaultException : 
         */

        
                public void activateServer
                (
                  org.wso2.ws.dataservice.ActivateServer activateServer
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * This operation deletes namespaces belonging to a particular xpath configuration.
                                    * @param deleteNamespaceData
             * @throws DataServiceFaultException : 
         */

        
                public void deleteNamespaceData
                (
                  org.wso2.ws.dataservice.DeleteNamespaceData deleteNamespaceData
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getServiceForServer
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ServicesE getServiceForServer
                (
                  org.wso2.carbon.bam.GetServiceForServer getServiceForServer
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateServer
             * @throws DataServiceFaultException : 
         */

        
                public void updateServer
                (
                  org.wso2.ws.dataservice.UpdateServer updateServer
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param deleteMessage
             * @throws DataServiceFaultException : 
         */

        
                public void deleteMessage
                (
                  org.wso2.ws.dataservice.DeleteMessage deleteMessage
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * This operation adds details corresponds to a particular xpath to the table xpath.
                                    * @param addXpathData
             * @throws DataServiceFaultException : 
         */

        
                public void addXpathData
                (
                  org.wso2.ws.dataservice.AddXpathData addXpathData
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getServerFromBAMDB
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ServersE getServerFromBAMDB
                (
                  org.wso2.carbon.bam.GetServerFromBAMDB getServerFromBAMDB
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getMessageProperty
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.MessagepropertiessE getMessageProperty
                (
                  org.wso2.carbon.bam.GetMessageProperty getMessageProperty
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getSequences
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.SequencesE getSequences
                (
                  org.wso2.carbon.bam.GetSequences getSequences
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param deleteServer
             * @throws DataServiceFaultException : 
         */

        
                public void deleteServer
                (
                  org.wso2.ws.dataservice.DeleteServer deleteServer
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateMessageDump
             * @throws DataServiceFaultException : 
         */

        
                public void updateMessageDump
                (
                  org.wso2.ws.dataservice.UpdateMessageDump updateMessageDump
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateMessageStatus
             * @throws DataServiceFaultException : 
         */

        
                public void updateMessageStatus
                (
                  org.wso2.ws.dataservice.UpdateMessageStatus updateMessageStatus
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllTenents
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.TenentsE getAllTenents
                (
                  org.wso2.carbon.bam.GetAllTenents getAllTenents
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getProxyServices
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ProxyServicesE getProxyServices
                (
                  org.wso2.carbon.bam.GetProxyServices getProxyServices
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addMessage
             * @throws DataServiceFaultException : 
         */

        
                public void addMessage
                (
                  org.wso2.ws.dataservice.AddMessage addMessage
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getService
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ServicesE getService
                (
                  org.wso2.carbon.bam.GetService getService
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * This operation updates and existing xpath record with some new set of values.
                                    * @param updateXpathData
             * @throws DataServiceFaultException : 
         */

        
                public void updateXpathData
                (
                  org.wso2.ws.dataservice.UpdateXpathData updateXpathData
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * This operation updates data corresponds to a particular namespace with a given set of new data.
                                    * @param updateNamespaceData
             * @throws DataServiceFaultException : 
         */

        
                public void updateNamespaceData
                (
                  org.wso2.ws.dataservice.UpdateNamespaceData updateNamespaceData
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllClients
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ClientsE getAllClients
                (
                  org.wso2.carbon.bam.GetAllClients getAllClients
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllMessages
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.MessagesE getAllMessages
                (
                  org.wso2.carbon.bam.GetAllMessages getAllMessages
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addActivityData
             * @throws DataServiceFaultException : 
         */

        
                public void addActivityData
                (
                  org.wso2.ws.dataservice.AddActivityData addActivityData
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllActivities
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ActivitiesE getAllActivities
                (
                  org.wso2.carbon.bam.GetAllActivities getAllActivities
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getServer
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ServersE getServer
                (
                  org.wso2.carbon.bam.GetServer getServer
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param deleteOperation
             * @throws DataServiceFaultException : 
         */

        
                public void deleteOperation
                (
                  org.wso2.ws.dataservice.DeleteOperation deleteOperation
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getOperation
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.OperationsE getOperation
                (
                  org.wso2.carbon.bam.GetOperation getOperation
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addServer
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.server.dss.ServerIDsE addServer
                (
                  org.wso2.carbon.bam.server.dss.AddServer addServer
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param deleteService
             * @throws DataServiceFaultException : 
         */

        
                public void deleteService
                (
                  org.wso2.ws.dataservice.DeleteService deleteService
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateActivity
             * @throws DataServiceFaultException : 
         */

        
                public void updateActivity
                (
                  org.wso2.ws.dataservice.UpdateActivity updateActivity
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param deleteActivity
             * @throws DataServiceFaultException : 
         */

        
                public void deleteActivity
                (
                  org.wso2.ws.dataservice.DeleteActivity deleteActivity
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateServerWithSubscription
             * @throws DataServiceFaultException : 
         */

        
                public void updateServerWithSubscription
                (
                  org.wso2.ws.dataservice.UpdateServerWithSubscription updateServerWithSubscription
                 )
            throws DataServiceFaultException;
        
         }
    
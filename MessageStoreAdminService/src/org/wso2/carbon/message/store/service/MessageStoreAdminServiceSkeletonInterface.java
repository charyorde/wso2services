
/**
 * MessageStoreAdminServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.message.store.service;
    /**
     *  MessageStoreAdminServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface MessageStoreAdminServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param modifyMessageStore
         */

        
                public void modifyMessageStore
                (
                  synapse.apache.org.xsd.ModifyMessageStore modifyMessageStore
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getMessageStore
         */

        
                public synapse.apache.org.xsd.GetMessageStoreResponse getMessageStore
                (
                  synapse.apache.org.xsd.GetMessageStore getMessageStore
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getClassName
         */

        
                public synapse.apache.org.xsd.GetClassNameResponse getClassName
                (
                  synapse.apache.org.xsd.GetClassName getClassName
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param deleteMessage
         */

        
                public void deleteMessage
                (
                  synapse.apache.org.xsd.DeleteMessage deleteMessage
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getPaginatedMessages
         */

        
                public synapse.apache.org.xsd.GetPaginatedMessagesResponse getPaginatedMessages
                (
                  synapse.apache.org.xsd.GetPaginatedMessages getPaginatedMessages
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getEnvelope
         */

        
                public synapse.apache.org.xsd.GetEnvelopeResponse getEnvelope
                (
                  synapse.apache.org.xsd.GetEnvelope getEnvelope
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getSize
         */

        
                public synapse.apache.org.xsd.GetSizeResponse getSize
                (
                  synapse.apache.org.xsd.GetSize getSize
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param deleteMessageStore
         */

        
                public void deleteMessageStore
                (
                  synapse.apache.org.xsd.DeleteMessageStore deleteMessageStore
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getMessageStoreNames
         */

        
                public synapse.apache.org.xsd.GetMessageStoreNamesResponse getMessageStoreNames
                (
                  synapse.apache.org.xsd.GetMessageStoreNames getMessageStoreNames
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllMessages
         */

        
                public synapse.apache.org.xsd.GetAllMessagesResponse getAllMessages
                (
                  synapse.apache.org.xsd.GetAllMessages getAllMessages
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param deleteAllMessages
         */

        
                public void deleteAllMessages
                (
                  synapse.apache.org.xsd.DeleteAllMessages deleteAllMessages
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addMessageStore
         */

        
                public void addMessageStore
                (
                  synapse.apache.org.xsd.AddMessageStore addMessageStore
                 )
            ;
        
         }
    
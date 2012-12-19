
/**
 * WSRegistryServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.registry.ws.api;
    /**
     *  WSRegistryServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface WSRegistryServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param createVersion
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public void createVersion
                (
                  org.wso2.carbon.registry.ws.api.CreateVersion createVersion
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param copy
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.CopyResponse copy
                (
                  org.wso2.carbon.registry.ws.api.Copy copy
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param removeComment
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public void removeComment
                (
                  org.wso2.carbon.registry.ws.api.RemoveComment removeComment
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param wSget
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.WSgetResponse wSget
                (
                  org.wso2.carbon.registry.ws.api.WSget wSget
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param move
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.MoveResponse move
                (
                  org.wso2.carbon.registry.ws.api.Move move
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAverageRating
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.GetAverageRatingResponse getAverageRating
                (
                  org.wso2.carbon.registry.ws.api.GetAverageRating getAverageRating
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param associateAspect
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public void associateAspect
                (
                  org.wso2.carbon.registry.ws.api.AssociateAspect associateAspect
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param wSsearchContent
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.WSsearchContentResponse wSsearchContent
                (
                  org.wso2.carbon.registry.ws.api.WSsearchContent wSsearchContent
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param wSgetChildCollection
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.WSgetChildCollectionResponse wSgetChildCollection
                (
                  org.wso2.carbon.registry.ws.api.WSgetChildCollection wSgetChildCollection
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAspectActions
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.GetAspectActionsResponse getAspectActions
                (
                  org.wso2.carbon.registry.ws.api.GetAspectActions getAspectActions
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param rename
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.RenameResponse rename
                (
                  org.wso2.carbon.registry.ws.api.Rename rename
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param wSgetSingleComment
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.WSgetSingleCommentResponse wSgetSingleComment
                (
                  org.wso2.carbon.registry.ws.api.WSgetSingleComment wSgetSingleComment
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param wSgetAssociations
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.WSgetAssociationsResponse wSgetAssociations
                (
                  org.wso2.carbon.registry.ws.api.WSgetAssociations wSgetAssociations
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getContent
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.GetContentResponse getContent
                (
                  org.wso2.carbon.registry.ws.api.GetContent getContent
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param wSput
             * @throws WSRegistryServiceRegistryExceptionException : 
             * @throws WSRegistryServiceIOExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.WSputResponse wSput
                (
                  org.wso2.carbon.registry.ws.api.WSput wSput
                 )
            throws WSRegistryServiceRegistryExceptionException,WSRegistryServiceIOExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param wsDump
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.WsDumpResponse wsDump
                (
                  org.wso2.carbon.registry.ws.api.WsDump wsDump
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getChildCount
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.GetChildCountResponse getChildCount
                (
                  org.wso2.carbon.registry.ws.api.GetChildCount getChildCount
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param removeTag
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public void removeTag
                (
                  org.wso2.carbon.registry.ws.api.RemoveTag removeTag
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAvailableAspects
         */

        
                public org.wso2.carbon.registry.ws.api.GetAvailableAspectsResponse getAvailableAspects
                (
                  org.wso2.carbon.registry.ws.api.GetAvailableAspects getAvailableAspects
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param wsRestore
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public void wsRestore
                (
                  org.wso2.carbon.registry.ws.api.WsRestore wsRestore
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getRating
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.GetRatingResponse getRating
                (
                  org.wso2.carbon.registry.ws.api.GetRating getRating
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param wSgetLogs
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.WSgetLogsResponse wSgetLogs
                (
                  org.wso2.carbon.registry.ws.api.WSgetLogs wSgetLogs
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getCollectionContent
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.GetCollectionContentResponse getCollectionContent
                (
                  org.wso2.carbon.registry.ws.api.GetCollectionContent getCollectionContent
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getVersions
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.GetVersionsResponse getVersions
                (
                  org.wso2.carbon.registry.ws.api.GetVersions getVersions
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param wSnewResource
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.WSnewResourceResponse wSnewResource
                (
                  org.wso2.carbon.registry.ws.api.WSnewResource wSnewResource
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param removeLink
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public void removeLink
                (
                  org.wso2.carbon.registry.ws.api.RemoveLink removeLink
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param wSaddComment
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.WSaddCommentResponse wSaddComment
                (
                  org.wso2.carbon.registry.ws.api.WSaddComment wSaddComment
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param applyTag
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public void applyTag
                (
                  org.wso2.carbon.registry.ws.api.ApplyTag applyTag
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param setTenantId
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public void setTenantId
                (
                  org.wso2.carbon.registry.ws.api.SetTenantId setTenantId
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param rateResource
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public void rateResource
                (
                  org.wso2.carbon.registry.ws.api.RateResource rateResource
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param removeAspect
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.RemoveAspectResponse removeAspect
                (
                  org.wso2.carbon.registry.ws.api.RemoveAspect removeAspect
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param wSnewCollection
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.WSnewCollectionResponse wSnewCollection
                (
                  org.wso2.carbon.registry.ws.api.WSnewCollection wSnewCollection
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param wSgetMetaData
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.WSgetMetaDataResponse wSgetMetaData
                (
                  org.wso2.carbon.registry.ws.api.WSgetMetaData wSgetMetaData
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param removeAssociation
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public void removeAssociation
                (
                  org.wso2.carbon.registry.ws.api.RemoveAssociation removeAssociation
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param editComment
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public void editComment
                (
                  org.wso2.carbon.registry.ws.api.EditComment editComment
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param delete
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public void delete
                (
                  org.wso2.carbon.registry.ws.api.Delete delete
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param wSgetAllAssociations
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.WSgetAllAssociationsResponse wSgetAllAssociations
                (
                  org.wso2.carbon.registry.ws.api.WSgetAllAssociations wSgetAllAssociations
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param resourceExists
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.ResourceExistsResponse resourceExists
                (
                  org.wso2.carbon.registry.ws.api.ResourceExists resourceExists
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param setEventingServiceURL
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public void setEventingServiceURL
                (
                  org.wso2.carbon.registry.ws.api.SetEventingServiceURL setEventingServiceURL
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param invokeAspectNoParam
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public void invokeAspectNoParam
                (
                  org.wso2.carbon.registry.ws.api.InvokeAspectNoParam invokeAspectNoParam
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param wSgetComments
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.WSgetCommentsResponse wSgetComments
                (
                  org.wso2.carbon.registry.ws.api.WSgetComments wSgetComments
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param wSimportResource
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.WSimportResourceResponse wSimportResource
                (
                  org.wso2.carbon.registry.ws.api.WSimportResource wSimportResource
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getEventingServiceURL
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.GetEventingServiceURLResponse getEventingServiceURL
                (
                  org.wso2.carbon.registry.ws.api.GetEventingServiceURL getEventingServiceURL
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param wSgetTags
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.WSgetTagsResponse wSgetTags
                (
                  org.wso2.carbon.registry.ws.api.WSgetTags wSgetTags
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param wSgetResourcePathsWithTag
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.WSgetResourcePathsWithTagResponse wSgetResourcePathsWithTag
                (
                  org.wso2.carbon.registry.ws.api.WSgetResourcePathsWithTag wSgetResourcePathsWithTag
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param invokeAspectWithParam
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public void invokeAspectWithParam
                (
                  org.wso2.carbon.registry.ws.api.InvokeAspectWithParam invokeAspectWithParam
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param createLinkWithSubTarget
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public void createLinkWithSubTarget
                (
                  org.wso2.carbon.registry.ws.api.CreateLinkWithSubTarget createLinkWithSubTarget
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param restoreVersion
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public void restoreVersion
                (
                  org.wso2.carbon.registry.ws.api.RestoreVersion restoreVersion
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param wSgetWithPageSize
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.WSgetWithPageSizeResponse wSgetWithPageSize
                (
                  org.wso2.carbon.registry.ws.api.WSgetWithPageSize wSgetWithPageSize
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addAssociation
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public void addAssociation
                (
                  org.wso2.carbon.registry.ws.api.AddAssociation addAssociation
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param wSexecuteQuery
             * @throws WSRegistryServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.ws.api.WSexecuteQueryResponse wSexecuteQuery
                (
                  org.wso2.carbon.registry.ws.api.WSexecuteQuery wSexecuteQuery
                 )
            throws WSRegistryServiceRegistryExceptionException;
        
         }
    
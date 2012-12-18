
/**
 * SearchAdminServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.registry.search.services;
    /**
     *  SearchAdminServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface SearchAdminServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param getMediaTypeSearch
             * @throws SearchAdminServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.search.services.GetMediaTypeSearchResponse getMediaTypeSearch
                (
                  org.wso2.carbon.registry.search.services.GetMediaTypeSearch getMediaTypeSearch
                 )
            throws SearchAdminServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getSavedFilters
             * @throws SearchAdminServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.search.services.GetSavedFiltersResponse getSavedFilters
                (
                  org.wso2.carbon.registry.search.services.GetSavedFilters getSavedFilters
                 )
            throws SearchAdminServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param deleteFilter
             * @throws SearchAdminServiceRegistryExceptionException : 
         */

        
                public void deleteFilter
                (
                  org.wso2.carbon.registry.search.services.DeleteFilter deleteFilter
                 )
            throws SearchAdminServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param saveAdvancedSearchFilter
             * @throws SearchAdminServiceRegistryExceptionException : 
         */

        
                public void saveAdvancedSearchFilter
                (
                  org.wso2.carbon.registry.search.services.SaveAdvancedSearchFilter saveAdvancedSearchFilter
                 )
            throws SearchAdminServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getSearchResults
             * @throws SearchAdminServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.search.services.GetSearchResultsResponse getSearchResults
                (
                  org.wso2.carbon.registry.search.services.GetSearchResults getSearchResults
                 )
            throws SearchAdminServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAdvancedSearchResults
             * @throws SearchAdminServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.search.services.GetAdvancedSearchResultsResponse getAdvancedSearchResults
                (
                  org.wso2.carbon.registry.search.services.GetAdvancedSearchResults getAdvancedSearchResults
                 )
            throws SearchAdminServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAdvancedSearchFilter
             * @throws SearchAdminServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.search.services.GetAdvancedSearchFilterResponse getAdvancedSearchFilter
                (
                  org.wso2.carbon.registry.search.services.GetAdvancedSearchFilter getAdvancedSearchFilter
                 )
            throws SearchAdminServiceRegistryExceptionException;
        
         }
    
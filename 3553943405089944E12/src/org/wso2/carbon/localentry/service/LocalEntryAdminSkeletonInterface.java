
/**
 * LocalEntryAdminSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.localentry.service;
    /**
     *  LocalEntryAdminSkeletonInterface java skeleton interface for the axisService
     */
    public interface LocalEntryAdminSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param paginatedEntryData
             * @throws LocalEntryAdminLocalEntryAdminException : 
         */

        
                public axis2.apache.org.xsd.PaginatedEntryDataResponse paginatedEntryData
                (
                  axis2.apache.org.xsd.PaginatedEntryData paginatedEntryData
                 )
            throws LocalEntryAdminLocalEntryAdminException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getEntryNamesString
             * @throws LocalEntryAdminLocalEntryAdminException : 
         */

        
                public axis2.apache.org.xsd.GetEntryNamesStringResponse getEntryNamesString
                (
                  axis2.apache.org.xsd.GetEntryNamesString getEntryNamesString
                 )
            throws LocalEntryAdminLocalEntryAdminException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getEntryNames
             * @throws LocalEntryAdminLocalEntryAdminException : 
         */

        
                public axis2.apache.org.xsd.GetEntryNamesResponse getEntryNames
                (
                  axis2.apache.org.xsd.GetEntryNames getEntryNames
                 )
            throws LocalEntryAdminLocalEntryAdminException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addEntry
             * @throws LocalEntryAdminLocalEntryAdminException : 
         */

        
                public axis2.apache.org.xsd.AddEntryResponse addEntry
                (
                  axis2.apache.org.xsd.AddEntry addEntry
                 )
            throws LocalEntryAdminLocalEntryAdminException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getDependents
         */

        
                public axis2.apache.org.xsd.GetDependentsResponse getDependents
                (
                  axis2.apache.org.xsd.GetDependents getDependents
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param saveEntry
             * @throws LocalEntryAdminLocalEntryAdminException : 
         */

        
                public axis2.apache.org.xsd.SaveEntryResponse saveEntry
                (
                  axis2.apache.org.xsd.SaveEntry saveEntry
                 )
            throws LocalEntryAdminLocalEntryAdminException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param entryData
             * @throws LocalEntryAdminLocalEntryAdminException : 
         */

        
                public axis2.apache.org.xsd.EntryDataResponse entryData
                (
                  axis2.apache.org.xsd.EntryDataE entryData
                 )
            throws LocalEntryAdminLocalEntryAdminException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getEntry
             * @throws LocalEntryAdminLocalEntryAdminException : 
         */

        
                public axis2.apache.org.xsd.GetEntryResponse getEntry
                (
                  axis2.apache.org.xsd.GetEntry getEntry
                 )
            throws LocalEntryAdminLocalEntryAdminException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getEntryDataCount
             * @throws LocalEntryAdminLocalEntryAdminException : 
         */

        
                public axis2.apache.org.xsd.GetEntryDataCountResponse getEntryDataCount
                (
                  axis2.apache.org.xsd.GetEntryDataCount getEntryDataCount
                 )
            throws LocalEntryAdminLocalEntryAdminException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param deleteEntry
             * @throws LocalEntryAdminLocalEntryAdminException : 
         */

        
                public axis2.apache.org.xsd.DeleteEntryResponse deleteEntry
                (
                  axis2.apache.org.xsd.DeleteEntry deleteEntry
                 )
            throws LocalEntryAdminLocalEntryAdminException;
        
         }
    

/**
 * CassandraClusterAdminSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.cassandra.mgt;
    /**
     *  CassandraClusterAdminSkeletonInterface java skeleton interface for the axisService
     */
    public interface CassandraClusterAdminSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param getColumnFamilyStats
             * @throws CassandraClusterAdminCassandraServerManagementException : 
         */

        
                public axis2.apache.org.xsd.GetColumnFamilyStatsResponse getColumnFamilyStats
                (
                  axis2.apache.org.xsd.GetColumnFamilyStats getColumnFamilyStats
                 )
            throws CassandraClusterAdminCassandraServerManagementException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getNodes
             * @throws CassandraClusterAdminCassandraServerManagementException : 
         */

        
                public axis2.apache.org.xsd.GetNodesResponse getNodes
                (
                  axis2.apache.org.xsd.GetNodes getNodes
                 )
            throws CassandraClusterAdminCassandraServerManagementException;
        
         }
    
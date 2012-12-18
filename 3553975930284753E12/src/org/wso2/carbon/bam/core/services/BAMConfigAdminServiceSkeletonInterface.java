
/**
 * BAMConfigAdminServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.bam.core.services;
    /**
     *  BAMConfigAdminServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface BAMConfigAdminServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param getDataArchivalPeriod
             * @throws BAMConfigAdminServiceBAMException : 
         */

        
                public axis2.apache.org.xsd.GetDataArchivalPeriodResponse getDataArchivalPeriod
                (
                  axis2.apache.org.xsd.GetDataArchivalPeriod getDataArchivalPeriod
                 )
            throws BAMConfigAdminServiceBAMException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addServer
             * @throws BAMConfigAdminServiceBAMException : 
         */

        
                public axis2.apache.org.xsd.AddServerResponse addServer
                (
                  axis2.apache.org.xsd.AddServer addServer
                 )
            throws BAMConfigAdminServiceBAMException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateServer
             * @throws BAMConfigAdminServiceBAMException : 
         */

        
                public void updateServer
                (
                  axis2.apache.org.xsd.UpdateServer updateServer
                 )
            throws BAMConfigAdminServiceBAMException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getDataRetentionPeriod
             * @throws BAMConfigAdminServiceBAMException : 
         */

        
                public axis2.apache.org.xsd.GetDataRetentionPeriodResponse getDataRetentionPeriod
                (
                  axis2.apache.org.xsd.GetDataRetentionPeriod getDataRetentionPeriod
                 )
            throws BAMConfigAdminServiceBAMException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param setDataArchivalPeriod
             * @throws BAMConfigAdminServiceBAMException : 
         */

        
                public void setDataArchivalPeriod
                (
                  axis2.apache.org.xsd.SetDataArchivalPeriod setDataArchivalPeriod
                 )
            throws BAMConfigAdminServiceBAMException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getServerDetails
             * @throws BAMConfigAdminServiceBAMException : 
         */

        
                public axis2.apache.org.xsd.GetServerDetailsResponse getServerDetails
                (
                  axis2.apache.org.xsd.GetServerDetails getServerDetails
                 )
            throws BAMConfigAdminServiceBAMException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param removeServer
             * @throws BAMConfigAdminServiceBAMException : 
         */

        
                public void removeServer
                (
                  axis2.apache.org.xsd.RemoveServer removeServer
                 )
            throws BAMConfigAdminServiceBAMException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getServerList
             * @throws BAMConfigAdminServiceBAMException : 
         */

        
                public axis2.apache.org.xsd.GetServerListResponse getServerList
                (
                  axis2.apache.org.xsd.GetServerList getServerList
                 )
            throws BAMConfigAdminServiceBAMException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param deactivateServer
             * @throws BAMConfigAdminServiceBAMException : 
         */

        
                public void deactivateServer
                (
                  axis2.apache.org.xsd.DeactivateServer deactivateServer
                 )
            throws BAMConfigAdminServiceBAMException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param activateServer
             * @throws BAMConfigAdminServiceBAMException : 
         */

        
                public void activateServer
                (
                  axis2.apache.org.xsd.ActivateServer activateServer
                 )
            throws BAMConfigAdminServiceBAMException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param subscribe
             * @throws BAMConfigAdminServiceBAMException : 
         */

        
                public axis2.apache.org.xsd.SubscribeResponse subscribe
                (
                  axis2.apache.org.xsd.Subscribe subscribe
                 )
            throws BAMConfigAdminServiceBAMException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param setDataRetentionPeriod
             * @throws BAMConfigAdminServiceBAMException : 
         */

        
                public void setDataRetentionPeriod
                (
                  axis2.apache.org.xsd.SetDataRetentionPeriod setDataRetentionPeriod
                 )
            throws BAMConfigAdminServiceBAMException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param unsubscribe
             * @throws BAMConfigAdminServiceBAMException : 
         */

        
                public void unsubscribe
                (
                  axis2.apache.org.xsd.Unsubscribe unsubscribe
                 )
            throws BAMConfigAdminServiceBAMException;
        
         }
    
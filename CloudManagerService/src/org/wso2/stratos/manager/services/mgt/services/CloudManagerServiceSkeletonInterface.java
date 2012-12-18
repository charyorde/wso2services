
/**
 * CloudManagerServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.stratos.manager.services.mgt.services;
    /**
     *  CloudManagerServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface CloudManagerServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param deactivate
             * @throws CloudManagerServiceExceptionException : 
         */

        
                public void deactivate
                (
                  org.wso2.stratos.manager.services.mgt.services.Deactivate deactivate
                 )
            throws CloudManagerServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param retrieveCloudServiceInfo
             * @throws CloudManagerServiceExceptionException : 
         */

        
                public org.wso2.stratos.manager.services.mgt.services.RetrieveCloudServiceInfoResponse retrieveCloudServiceInfo
                (
                  org.wso2.stratos.manager.services.mgt.services.RetrieveCloudServiceInfo retrieveCloudServiceInfo
                 )
            throws CloudManagerServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param activate
             * @throws CloudManagerServiceExceptionException : 
         */

        
                public void activate
                (
                  org.wso2.stratos.manager.services.mgt.services.Activate activate
                 )
            throws CloudManagerServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param saveCloudServicesActivity
             * @throws CloudManagerServiceExceptionException : 
         */

        
                public void saveCloudServicesActivity
                (
                  org.wso2.stratos.manager.services.mgt.services.SaveCloudServicesActivity saveCloudServicesActivity
                 )
            throws CloudManagerServiceExceptionException;
        
         }
    
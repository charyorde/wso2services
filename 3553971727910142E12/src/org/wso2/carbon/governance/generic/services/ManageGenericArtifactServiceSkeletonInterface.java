
/**
 * ManageGenericArtifactServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.governance.generic.services;
    /**
     *  ManageGenericArtifactServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface ManageGenericArtifactServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param setArtifactUIConfiguration
             * @throws ManageGenericArtifactServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.governance.generic.services.SetArtifactUIConfigurationResponse setArtifactUIConfiguration
                (
                  org.wso2.carbon.governance.generic.services.SetArtifactUIConfiguration setArtifactUIConfiguration
                 )
            throws ManageGenericArtifactServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param canChange
             * @throws ManageGenericArtifactServiceExceptionException : 
         */

        
                public org.wso2.carbon.governance.generic.services.CanChangeResponse canChange
                (
                  org.wso2.carbon.governance.generic.services.CanChange canChange
                 )
            throws ManageGenericArtifactServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getArtifactContent
             * @throws ManageGenericArtifactServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.governance.generic.services.GetArtifactContentResponse getArtifactContent
                (
                  org.wso2.carbon.governance.generic.services.GetArtifactContent getArtifactContent
                 )
            throws ManageGenericArtifactServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getArtifactUIConfiguration
             * @throws ManageGenericArtifactServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.governance.generic.services.GetArtifactUIConfigurationResponse getArtifactUIConfiguration
                (
                  org.wso2.carbon.governance.generic.services.GetArtifactUIConfiguration getArtifactUIConfiguration
                 )
            throws ManageGenericArtifactServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param listArtifacts
         */

        
                public org.wso2.carbon.governance.generic.services.ListArtifactsResponse listArtifacts
                (
                  org.wso2.carbon.governance.generic.services.ListArtifacts listArtifacts
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addArtifact
             * @throws ManageGenericArtifactServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.governance.generic.services.AddArtifactResponse addArtifact
                (
                  org.wso2.carbon.governance.generic.services.AddArtifact addArtifact
                 )
            throws ManageGenericArtifactServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param editArtifact
             * @throws ManageGenericArtifactServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.governance.generic.services.EditArtifactResponse editArtifact
                (
                  org.wso2.carbon.governance.generic.services.EditArtifact editArtifact
                 )
            throws ManageGenericArtifactServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAvailableAspects
             * @throws ManageGenericArtifactServiceExceptionException : 
         */

        
                public org.wso2.carbon.governance.generic.services.GetAvailableAspectsResponse getAvailableAspects
                (
                  org.wso2.carbon.governance.generic.services.GetAvailableAspects getAvailableAspects
                 )
            throws ManageGenericArtifactServiceExceptionException;
        
         }
    
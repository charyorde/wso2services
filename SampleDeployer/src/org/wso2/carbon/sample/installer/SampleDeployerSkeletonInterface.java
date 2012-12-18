
/**
 * SampleDeployerSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.sample.installer;
    /**
     *  SampleDeployerSkeletonInterface java skeleton interface for the axisService
     */
    public interface SampleDeployerSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param deploySample
             * @throws SampleDeployerRegistryExceptionException : 
         */

        
                public org.wso2.carbon.sample.installer.DeploySampleResponse deploySample
                (
                  org.wso2.carbon.sample.installer.DeploySample deploySample
                 )
            throws SampleDeployerRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getSampleInformation
         */

        
                public org.wso2.carbon.sample.installer.GetSampleInformationResponse getSampleInformation
                (
                  org.wso2.carbon.sample.installer.GetSampleInformation getSampleInformation
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param uploadSample
             * @throws SampleDeployerRegistryExceptionException : 
         */

        
                public org.wso2.carbon.sample.installer.UploadSampleResponse uploadSample
                (
                  org.wso2.carbon.sample.installer.UploadSample uploadSample
                 )
            throws SampleDeployerRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param setPolicyPermission
         */

        
                public void setPolicyPermission
                (
                  org.wso2.carbon.sample.installer.SetPolicyPermission setPolicyPermission
                 )
            ;
        
         }
    
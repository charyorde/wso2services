
/**
 * CustomMeteringServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.usage.agent.services;
    /**
     *  CustomMeteringServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface CustomMeteringServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param isUsageEntryExists
             * @throws CustomMeteringServiceExceptionException : 
         */

        
                public org.wso2.carbon.usage.agent.services.IsUsageEntryExistsResponse isUsageEntryExists
                (
                  org.wso2.carbon.usage.agent.services.IsUsageEntryExists isUsageEntryExists
                 )
            throws CustomMeteringServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param retrieveUsage
             * @throws CustomMeteringServiceUsageExceptionException : 
         */

        
                public org.wso2.carbon.usage.agent.services.RetrieveUsageResponse retrieveUsage
                (
                  org.wso2.carbon.usage.agent.services.RetrieveUsage retrieveUsage
                 )
            throws CustomMeteringServiceUsageExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addUsage
             * @throws CustomMeteringServiceExceptionException : 
         */

        
                public org.wso2.carbon.usage.agent.services.AddUsageResponse addUsage
                (
                  org.wso2.carbon.usage.agent.services.AddUsage addUsage
                 )
            throws CustomMeteringServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param persistUsage
             * @throws CustomMeteringServiceExceptionException : 
         */

        
                public void persistUsage
                (
                  org.wso2.carbon.usage.agent.services.PersistUsage persistUsage
                 )
            throws CustomMeteringServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getRecordedDurations
             * @throws CustomMeteringServiceExceptionException : 
         */

        
                public org.wso2.carbon.usage.agent.services.GetRecordedDurationsResponse getRecordedDurations
                (
                  org.wso2.carbon.usage.agent.services.GetRecordedDurations getRecordedDurations
                 )
            throws CustomMeteringServiceExceptionException;
        
         }
    
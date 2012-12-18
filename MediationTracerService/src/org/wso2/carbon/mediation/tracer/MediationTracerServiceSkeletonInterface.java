
/**
 * MediationTracerServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.mediation.tracer;
    /**
     *  MediationTracerServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface MediationTracerServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param searchTraceLog
             * @throws MediationTracerServiceMediationTracerExceptionException : 
         */

        
                public org.wso2.carbon.mediation.tracer.SearchTraceLogResponse searchTraceLog
                (
                  org.wso2.carbon.mediation.tracer.SearchTraceLog searchTraceLog
                 )
            throws MediationTracerServiceMediationTracerExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getTraceLogs
         */

        
                public org.wso2.carbon.mediation.tracer.GetTraceLogsResponse getTraceLogs
                (
                  org.wso2.carbon.mediation.tracer.GetTraceLogs getTraceLogs
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLogs
         */

        
                public org.wso2.carbon.mediation.tracer.GetLogsResponse getLogs
                (
                  org.wso2.carbon.mediation.tracer.GetLogs getLogs
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param clearTraceLogs
         */

        
                public org.wso2.carbon.mediation.tracer.ClearTraceLogsResponse clearTraceLogs
                (
                  org.wso2.carbon.mediation.tracer.ClearTraceLogs clearTraceLogs
                 )
            ;
        
         }
    
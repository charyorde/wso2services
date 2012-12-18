
/**
 * LoggingAdminSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.logging.service;
    /**
     *  LoggingAdminSkeletonInterface java skeleton interface for the axisService
     */
    public interface LoggingAdminSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllLoggerData
         */

        
                public axis2.apache.org.xsd.GetAllLoggerDataResponse getAllLoggerData
                (
                  axis2.apache.org.xsd.GetAllLoggerData getAllLoggerData
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param isStratosService
             * @throws LoggingAdminException : 
         */

        
                public axis2.apache.org.xsd.IsStratosServiceResponse isStratosService
                (
                  axis2.apache.org.xsd.IsStratosService isStratosService
                 )
            throws LoggingAdminException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateSyslogConfig
             * @throws LoggingAdminLoggingAdminException : 
         */

        
                public void updateSyslogConfig
                (
                  axis2.apache.org.xsd.UpdateSyslogConfig updateSyslogConfig
                 )
            throws LoggingAdminLoggingAdminException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param removeSyslogPattern
         */

        
                public axis2.apache.org.xsd.RemoveSyslogPatternResponse removeSyslogPattern
                (
                  axis2.apache.org.xsd.RemoveSyslogPattern removeSyslogPattern
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getSyslogData
             * @throws LoggingAdminLoggingAdminException : 
         */

        
                public axis2.apache.org.xsd.GetSyslogDataResponse getSyslogData
                (
                  axis2.apache.org.xsd.GetSyslogData getSyslogData
                 )
            throws LoggingAdminLoggingAdminException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param restoreDefaults
             * @throws LoggingAdminException : 
         */

        
                public void restoreDefaults
                (
                  axis2.apache.org.xsd.RestoreDefaults restoreDefaults
                 )
            throws LoggingAdminException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateSystemLog
             * @throws LoggingAdminException : 
         */

        
                public void updateSystemLog
                (
                  axis2.apache.org.xsd.UpdateSystemLog updateSystemLog
                 )
            throws LoggingAdminException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getSystemLog
             * @throws LoggingAdminException : 
         */

        
                public axis2.apache.org.xsd.GetSystemLogResponse getSystemLog
                (
                  axis2.apache.org.xsd.GetSystemLog getSystemLog
                 )
            throws LoggingAdminException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAppenderData
         */

        
                public axis2.apache.org.xsd.GetAppenderDataResponse getAppenderData
                (
                  axis2.apache.org.xsd.GetAppenderData getAppenderData
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateAllAppenderData
             * @throws LoggingAdminException : 
         */

        
                public void updateAllAppenderData
                (
                  axis2.apache.org.xsd.UpdateAllAppenderData updateAllAppenderData
                 )
            throws LoggingAdminException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLoggerData
         */

        
                public axis2.apache.org.xsd.GetLoggerDataResponse getLoggerData
                (
                  axis2.apache.org.xsd.GetLoggerData getLoggerData
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateLoggerData
             * @throws LoggingAdminException : 
         */

        
                public void updateLoggerData
                (
                  axis2.apache.org.xsd.UpdateLoggerData updateLoggerData
                 )
            throws LoggingAdminException;
        
         }
    
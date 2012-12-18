
/**
 * TaskAdminSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.task;
    /**
     *  TaskAdminSkeletonInterface java skeleton interface for the axisService
     */
    public interface TaskAdminSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param getTaskDescription
             * @throws TaskAdminTaskManagementException : 
         */

        
                public axis2.apache.org.xsd.GetTaskDescriptionResponse getTaskDescription
                (
                  axis2.apache.org.xsd.GetTaskDescription getTaskDescription
                 )
            throws TaskAdminTaskManagementException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllTaskDescriptions
             * @throws TaskAdminTaskManagementException : 
         */

        
                public axis2.apache.org.xsd.GetAllTaskDescriptionsResponse getAllTaskDescriptions
                (
                  axis2.apache.org.xsd.GetAllTaskDescriptions getAllTaskDescriptions
                 )
            throws TaskAdminTaskManagementException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param isContains
             * @throws TaskAdminTaskManagementException : 
         */

        
                public axis2.apache.org.xsd.IsContainsResponse isContains
                (
                  axis2.apache.org.xsd.IsContains isContains
                 )
            throws TaskAdminTaskManagementException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllJobGroups
         */

        
                public axis2.apache.org.xsd.GetAllJobGroupsResponse getAllJobGroups
                (
                  axis2.apache.org.xsd.GetAllJobGroups getAllJobGroups
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param editTaskDescription
             * @throws TaskAdminTaskManagementException : 
         */

        
                public void editTaskDescription
                (
                  axis2.apache.org.xsd.EditTaskDescription editTaskDescription
                 )
            throws TaskAdminTaskManagementException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param deleteTaskDescription
             * @throws TaskAdminTaskManagementException : 
         */

        
                public void deleteTaskDescription
                (
                  axis2.apache.org.xsd.DeleteTaskDescription deleteTaskDescription
                 )
            throws TaskAdminTaskManagementException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param loadTaskClassProperties
             * @throws TaskAdminTaskManagementException : 
         */

        
                public axis2.apache.org.xsd.LoadTaskClassPropertiesResponse loadTaskClassProperties
                (
                  axis2.apache.org.xsd.LoadTaskClassProperties loadTaskClassProperties
                 )
            throws TaskAdminTaskManagementException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addTaskDescription
             * @throws TaskAdminTaskManagementException : 
         */

        
                public void addTaskDescription
                (
                  axis2.apache.org.xsd.AddTaskDescription addTaskDescription
                 )
            throws TaskAdminTaskManagementException;
        
         }
    
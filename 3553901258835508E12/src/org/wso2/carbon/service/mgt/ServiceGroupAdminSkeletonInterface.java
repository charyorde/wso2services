
/**
 * ServiceGroupAdminSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.service.mgt;
    /**
     *  ServiceGroupAdminSkeletonInterface java skeleton interface for the axisService
     */
    public interface ServiceGroupAdminSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param listServiceGroup
             * @throws ServiceGroupAdminException : 
         */

        
                public axis2.apache.org.xsd.ListServiceGroupResponse listServiceGroup
                (
                  axis2.apache.org.xsd.ListServiceGroup listServiceGroup
                 )
            throws ServiceGroupAdminException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param setServiceGroupParameters
         */

        
                public void setServiceGroupParameters
                (
                  axis2.apache.org.xsd.SetServiceGroupParameters setServiceGroupParameters
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getServiceGroupParameter
             * @throws ServiceGroupAdminServerException : 
         */

        
                public axis2.apache.org.xsd.GetServiceGroupParameterResponse getServiceGroupParameter
                (
                  axis2.apache.org.xsd.GetServiceGroupParameter getServiceGroupParameter
                 )
            throws ServiceGroupAdminServerException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param configureServiceGroupMTOM
             * @throws ServiceGroupAdminException : 
         */

        
                public axis2.apache.org.xsd.ConfigureServiceGroupMTOMResponse configureServiceGroupMTOM
                (
                  axis2.apache.org.xsd.ConfigureServiceGroupMTOM configureServiceGroupMTOM
                 )
            throws ServiceGroupAdminException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param removeServiceGroupParameter
         */

        
                public void removeServiceGroupParameter
                (
                  axis2.apache.org.xsd.RemoveServiceGroupParameter removeServiceGroupParameter
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateServiceGroupParamters
             * @throws ServiceGroupAdminServerException : 
         */

        
                public void updateServiceGroupParamters
                (
                  axis2.apache.org.xsd.UpdateServiceGroupParamters updateServiceGroupParamters
                 )
            throws ServiceGroupAdminServerException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param dumpAAR
         */

        
                public axis2.apache.org.xsd.DumpAARResponse dumpAAR
                (
                  axis2.apache.org.xsd.DumpAAR dumpAAR
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param setServiceGroupParameter
         */

        
                public void setServiceGroupParameter
                (
                  axis2.apache.org.xsd.SetServiceGroupParameter setServiceGroupParameter
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateServiceGroupParameter
             * @throws ServiceGroupAdminServerException : 
         */

        
                public void updateServiceGroupParameter
                (
                  axis2.apache.org.xsd.UpdateServiceGroupParameter updateServiceGroupParameter
                 )
            throws ServiceGroupAdminServerException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param listServiceGroups
         */

        
                public axis2.apache.org.xsd.ListServiceGroupsResponse listServiceGroups
                (
                  axis2.apache.org.xsd.ListServiceGroups listServiceGroups
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getServiceGroupParameters
             * @throws ServiceGroupAdminServerException : 
         */

        
                public axis2.apache.org.xsd.GetServiceGroupParametersResponse getServiceGroupParameters
                (
                  axis2.apache.org.xsd.GetServiceGroupParameters getServiceGroupParameters
                 )
            throws ServiceGroupAdminServerException;
        
         }
    
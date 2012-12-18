
/**
 * DiscoveryAdminSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.discovery;
    /**
     *  DiscoveryAdminSkeletonInterface java skeleton interface for the axisService
     */
    public interface DiscoveryAdminSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param getDiscoveryProxy
             * @throws DiscoveryAdminException : 
         */

        
                public synapse.apache.org.xsd.GetDiscoveryProxyResponse getDiscoveryProxy
                (
                  synapse.apache.org.xsd.GetDiscoveryProxy getDiscoveryProxy
                 )
            throws DiscoveryAdminException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param resolveTargetService
             * @throws DiscoveryAdminException : 
         */

        
                public synapse.apache.org.xsd.ResolveTargetServiceResponse resolveTargetService
                (
                  synapse.apache.org.xsd.ResolveTargetService resolveTargetService
                 )
            throws DiscoveryAdminException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param enableServiceDiscovery
             * @throws DiscoveryAdminException : 
         */

        
                public void enableServiceDiscovery
                (
                  synapse.apache.org.xsd.EnableServiceDiscovery enableServiceDiscovery
                 )
            throws DiscoveryAdminException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param disableServiceDiscovery
             * @throws DiscoveryAdminException : 
         */

        
                public void disableServiceDiscovery
                (
                  synapse.apache.org.xsd.DisableServiceDiscovery disableServiceDiscovery
                 )
            throws DiscoveryAdminException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addDiscoveryProxy
             * @throws DiscoveryAdminException : 
         */

        
                public void addDiscoveryProxy
                (
                  synapse.apache.org.xsd.AddDiscoveryProxy addDiscoveryProxy
                 )
            throws DiscoveryAdminException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getServiceDiscoveryConfig
             * @throws DiscoveryAdminException : 
         */

        
                public synapse.apache.org.xsd.GetServiceDiscoveryConfigResponse getServiceDiscoveryConfig
                (
                  synapse.apache.org.xsd.GetServiceDiscoveryConfig getServiceDiscoveryConfig
                 )
            throws DiscoveryAdminException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param removeDiscoveryProxy
             * @throws DiscoveryAdminException : 
         */

        
                public void removeDiscoveryProxy
                (
                  synapse.apache.org.xsd.RemoveDiscoveryProxy removeDiscoveryProxy
                 )
            throws DiscoveryAdminException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getDiscoveryProxies
             * @throws DiscoveryAdminException : 
         */

        
                public synapse.apache.org.xsd.GetDiscoveryProxiesResponse getDiscoveryProxies
                (
                  synapse.apache.org.xsd.GetDiscoveryProxies getDiscoveryProxies
                 )
            throws DiscoveryAdminException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param probeDiscoveryProxy
             * @throws DiscoveryAdminException : 
         */

        
                public synapse.apache.org.xsd.ProbeDiscoveryProxyResponse probeDiscoveryProxy
                (
                  synapse.apache.org.xsd.ProbeDiscoveryProxy probeDiscoveryProxy
                 )
            throws DiscoveryAdminException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateDiscoveryProxy
             * @throws DiscoveryAdminException : 
         */

        
                public void updateDiscoveryProxy
                (
                  synapse.apache.org.xsd.UpdateDiscoveryProxy updateDiscoveryProxy
                 )
            throws DiscoveryAdminException;
        
         }
    
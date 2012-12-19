
/**
 * DiscoveryProxySkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.discovery.proxy;
    /**
     *  DiscoveryProxySkeletonInterface java skeleton interface for the axisService
     */
    public interface DiscoveryProxySkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param hello
             * @throws DiscoveryProxyDiscoveryException : 
         */

        
                public void hello
                (
                  org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Hello hello
                 )
            throws DiscoveryProxyDiscoveryException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param probe
             * @throws DiscoveryProxyDiscoveryException : 
         */

        
                public org.oasis_open.docs.ws_dd.ns.discovery._2009._01.ProbeResponse probe
                (
                  org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Probe probe
                 )
            throws DiscoveryProxyDiscoveryException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param bye
             * @throws DiscoveryProxyDiscoveryException : 
         */

        
                public void bye
                (
                  org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Bye bye
                 )
            throws DiscoveryProxyDiscoveryException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param resolve
             * @throws DiscoveryProxyDiscoveryException : 
         */

        
                public org.oasis_open.docs.ws_dd.ns.discovery._2009._01.ResolveResponse resolve
                (
                  org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Resolve resolve
                 )
            throws DiscoveryProxyDiscoveryException;
        
         }
    
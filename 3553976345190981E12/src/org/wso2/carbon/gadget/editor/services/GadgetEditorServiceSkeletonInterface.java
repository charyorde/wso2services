
/**
 * GadgetEditorServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.gadget.editor.services;
    /**
     *  GadgetEditorServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface GadgetEditorServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param saveGadget
             * @throws GadgetEditorServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.gadget.editor.services.SaveGadgetResponse saveGadget
                (
                  org.wso2.carbon.gadget.editor.services.SaveGadget saveGadget
                 )
            throws GadgetEditorServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param openGadget
             * @throws GadgetEditorServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.gadget.editor.services.OpenGadgetResponse openGadget
                (
                  org.wso2.carbon.gadget.editor.services.OpenGadget openGadget
                 )
            throws GadgetEditorServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param isResourceExist
         */

        
                public org.wso2.carbon.gadget.editor.services.IsResourceExistResponse isResourceExist
                (
                  org.wso2.carbon.gadget.editor.services.IsResourceExist isResourceExist
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getImmediateChildResources
         */

        
                public org.wso2.carbon.gadget.editor.services.GetImmediateChildResourcesResponse getImmediateChildResources
                (
                  org.wso2.carbon.gadget.editor.services.GetImmediateChildResources getImmediateChildResources
                 )
            ;
        
         }
    

/**
 * ThemeMgtServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

    package org.wso2.carbon.theme.mgt.services;

    /**
     *  ThemeMgtServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ThemeMgtServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ThemeMgtServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ThemeMgtServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for renameResource method
            * override this method for handling normal response from renameResource operation
            */
           public void receiveResultrenameResource(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from renameResource operation
           */
            public void receiveErrorrenameResource(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for delete method
            * override this method for handling normal response from delete operation
            */
           public void receiveResultdelete(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from delete operation
           */
            public void receiveErrordelete(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getMetadata method
            * override this method for handling normal response from getMetadata operation
            */
           public void receiveResultgetMetadata(
                    org.wso2.carbon.theme.mgt.services.GetMetadataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMetadata operation
           */
            public void receiveErrorgetMetadata(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getContentDownloadBean method
            * override this method for handling normal response from getContentDownloadBean operation
            */
           public void receiveResultgetContentDownloadBean(
                    org.wso2.carbon.theme.mgt.services.GetContentDownloadBeanResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getContentDownloadBean operation
           */
            public void receiveErrorgetContentDownloadBean(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addResource method
            * override this method for handling normal response from addResource operation
            */
           public void receiveResultaddResource(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addResource operation
           */
            public void receiveErroraddResource(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addCollection method
            * override this method for handling normal response from addCollection operation
            */
           public void receiveResultaddCollection(
                    org.wso2.carbon.theme.mgt.services.AddCollectionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addCollection operation
           */
            public void receiveErroraddCollection(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAllThemes method
            * override this method for handling normal response from getAllThemes operation
            */
           public void receiveResultgetAllThemes(
                    org.wso2.carbon.theme.mgt.services.GetAllThemesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllThemes operation
           */
            public void receiveErrorgetAllThemes(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateTextContent method
            * override this method for handling normal response from updateTextContent operation
            */
           public void receiveResultupdateTextContent(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateTextContent operation
           */
            public void receiveErrorupdateTextContent(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getContentBean method
            * override this method for handling normal response from getContentBean operation
            */
           public void receiveResultgetContentBean(
                    org.wso2.carbon.theme.mgt.services.GetContentBeanResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getContentBean operation
           */
            public void receiveErrorgetContentBean(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for applyTheme method
            * override this method for handling normal response from applyTheme operation
            */
           public void receiveResultapplyTheme(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from applyTheme operation
           */
            public void receiveErrorapplyTheme(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAllPaths method
            * override this method for handling normal response from getAllPaths operation
            */
           public void receiveResultgetAllPaths(
                    org.wso2.carbon.theme.mgt.services.GetAllPathsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllPaths operation
           */
            public void receiveErrorgetAllPaths(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSessionResourcePath method
            * override this method for handling normal response from getSessionResourcePath operation
            */
           public void receiveResultgetSessionResourcePath(
                    org.wso2.carbon.theme.mgt.services.GetSessionResourcePathResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSessionResourcePath operation
           */
            public void receiveErrorgetSessionResourcePath(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for importResource method
            * override this method for handling normal response from importResource operation
            */
           public void receiveResultimportResource(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from importResource operation
           */
            public void receiveErrorimportResource(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getResourceData method
            * override this method for handling normal response from getResourceData operation
            */
           public void receiveResultgetResourceData(
                    org.wso2.carbon.theme.mgt.services.GetResourceDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getResourceData operation
           */
            public void receiveErrorgetResourceData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getCollectionContent method
            * override this method for handling normal response from getCollectionContent operation
            */
           public void receiveResultgetCollectionContent(
                    org.wso2.carbon.theme.mgt.services.GetCollectionContentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getCollectionContent operation
           */
            public void receiveErrorgetCollectionContent(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addTextResource method
            * override this method for handling normal response from addTextResource operation
            */
           public void receiveResultaddTextResource(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addTextResource operation
           */
            public void receiveErroraddTextResource(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTextContent method
            * override this method for handling normal response from getTextContent operation
            */
           public void receiveResultgetTextContent(
                    org.wso2.carbon.theme.mgt.services.GetTextContentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTextContent operation
           */
            public void receiveErrorgetTextContent(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getResourceTreeEntry method
            * override this method for handling normal response from getResourceTreeEntry operation
            */
           public void receiveResultgetResourceTreeEntry(
                    org.wso2.carbon.theme.mgt.services.GetResourceTreeEntryResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getResourceTreeEntry operation
           */
            public void receiveErrorgetResourceTreeEntry(java.lang.Exception e) {
            }
                


    }
    
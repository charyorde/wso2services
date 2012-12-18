

/**
 * ThemeMgtServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.theme.mgt.services;

    /*
     *  ThemeMgtServiceTest Junit test case
    */

    public class ThemeMgtServiceTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testrenameResource() throws java.lang.Exception{

        org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub =
                    new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.theme.mgt.services.RenameResource renameResource331=
                                                        (org.wso2.carbon.theme.mgt.services.RenameResource)getTestObject(org.wso2.carbon.theme.mgt.services.RenameResource.class);
                    // TODO : Fill in the renameResource331 here
                
                    
                    //There is no output to be tested!
                    stub.renameResource(
                        renameResource331);
                    



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartrenameResource() throws java.lang.Exception{
            org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub = new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();
             org.wso2.carbon.theme.mgt.services.RenameResource renameResource331=
                                                        (org.wso2.carbon.theme.mgt.services.RenameResource)getTestObject(org.wso2.carbon.theme.mgt.services.RenameResource.class);
                    // TODO : Fill in the renameResource331 here
                

                stub.startrenameResource(
                         renameResource331,
                    new tempCallbackN1000C()
                );
              


        }

        private class tempCallbackN1000C  extends org.wso2.carbon.theme.mgt.services.ThemeMgtServiceCallbackHandler{
            public tempCallbackN1000C(){ super(null);}

            public void receiveResultrenameResource(
                         ) {
                
            }

            public void receiveErrorrenameResource(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testdelete() throws java.lang.Exception{

        org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub =
                    new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.theme.mgt.services.Delete delete333=
                                                        (org.wso2.carbon.theme.mgt.services.Delete)getTestObject(org.wso2.carbon.theme.mgt.services.Delete.class);
                    // TODO : Fill in the delete333 here
                
                    
                    //There is no output to be tested!
                    stub.delete(
                        delete333);
                    



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartdelete() throws java.lang.Exception{
            org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub = new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();
             org.wso2.carbon.theme.mgt.services.Delete delete333=
                                                        (org.wso2.carbon.theme.mgt.services.Delete)getTestObject(org.wso2.carbon.theme.mgt.services.Delete.class);
                    // TODO : Fill in the delete333 here
                

                stub.startdelete(
                         delete333,
                    new tempCallbackN10046()
                );
              


        }

        private class tempCallbackN10046  extends org.wso2.carbon.theme.mgt.services.ThemeMgtServiceCallbackHandler{
            public tempCallbackN10046(){ super(null);}

            public void receiveResultdelete(
                         ) {
                
            }

            public void receiveErrordelete(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetMetadata() throws java.lang.Exception{

        org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub =
                    new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.theme.mgt.services.GetMetadata getMetadata335=
                                                        (org.wso2.carbon.theme.mgt.services.GetMetadata)getTestObject(org.wso2.carbon.theme.mgt.services.GetMetadata.class);
                    // TODO : Fill in the getMetadata335 here
                
                        assertNotNull(stub.getMetadata(
                        getMetadata335));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetMetadata() throws java.lang.Exception{
            org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub = new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();
             org.wso2.carbon.theme.mgt.services.GetMetadata getMetadata335=
                                                        (org.wso2.carbon.theme.mgt.services.GetMetadata)getTestObject(org.wso2.carbon.theme.mgt.services.GetMetadata.class);
                    // TODO : Fill in the getMetadata335 here
                

                stub.startgetMetadata(
                         getMetadata335,
                    new tempCallbackN10080()
                );
              


        }

        private class tempCallbackN10080  extends org.wso2.carbon.theme.mgt.services.ThemeMgtServiceCallbackHandler{
            public tempCallbackN10080(){ super(null);}

            public void receiveResultgetMetadata(
                         org.wso2.carbon.theme.mgt.services.GetMetadataResponse result
                            ) {
                
            }

            public void receiveErrorgetMetadata(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetContentDownloadBean() throws java.lang.Exception{

        org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub =
                    new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.theme.mgt.services.GetContentDownloadBean getContentDownloadBean337=
                                                        (org.wso2.carbon.theme.mgt.services.GetContentDownloadBean)getTestObject(org.wso2.carbon.theme.mgt.services.GetContentDownloadBean.class);
                    // TODO : Fill in the getContentDownloadBean337 here
                
                        assertNotNull(stub.getContentDownloadBean(
                        getContentDownloadBean337));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetContentDownloadBean() throws java.lang.Exception{
            org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub = new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();
             org.wso2.carbon.theme.mgt.services.GetContentDownloadBean getContentDownloadBean337=
                                                        (org.wso2.carbon.theme.mgt.services.GetContentDownloadBean)getTestObject(org.wso2.carbon.theme.mgt.services.GetContentDownloadBean.class);
                    // TODO : Fill in the getContentDownloadBean337 here
                

                stub.startgetContentDownloadBean(
                         getContentDownloadBean337,
                    new tempCallbackN100BD()
                );
              


        }

        private class tempCallbackN100BD  extends org.wso2.carbon.theme.mgt.services.ThemeMgtServiceCallbackHandler{
            public tempCallbackN100BD(){ super(null);}

            public void receiveResultgetContentDownloadBean(
                         org.wso2.carbon.theme.mgt.services.GetContentDownloadBeanResponse result
                            ) {
                
            }

            public void receiveErrorgetContentDownloadBean(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testaddResource() throws java.lang.Exception{

        org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub =
                    new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.theme.mgt.services.AddResource addResource339=
                                                        (org.wso2.carbon.theme.mgt.services.AddResource)getTestObject(org.wso2.carbon.theme.mgt.services.AddResource.class);
                    // TODO : Fill in the addResource339 here
                
                    
                    //There is no output to be tested!
                    stub.addResource(
                        addResource339);
                    



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartaddResource() throws java.lang.Exception{
            org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub = new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();
             org.wso2.carbon.theme.mgt.services.AddResource addResource339=
                                                        (org.wso2.carbon.theme.mgt.services.AddResource)getTestObject(org.wso2.carbon.theme.mgt.services.AddResource.class);
                    // TODO : Fill in the addResource339 here
                

                stub.startaddResource(
                         addResource339,
                    new tempCallbackN100FA()
                );
              


        }

        private class tempCallbackN100FA  extends org.wso2.carbon.theme.mgt.services.ThemeMgtServiceCallbackHandler{
            public tempCallbackN100FA(){ super(null);}

            public void receiveResultaddResource(
                         ) {
                
            }

            public void receiveErroraddResource(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testaddCollection() throws java.lang.Exception{

        org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub =
                    new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.theme.mgt.services.AddCollection addCollection341=
                                                        (org.wso2.carbon.theme.mgt.services.AddCollection)getTestObject(org.wso2.carbon.theme.mgt.services.AddCollection.class);
                    // TODO : Fill in the addCollection341 here
                
                        assertNotNull(stub.addCollection(
                        addCollection341));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartaddCollection() throws java.lang.Exception{
            org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub = new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();
             org.wso2.carbon.theme.mgt.services.AddCollection addCollection341=
                                                        (org.wso2.carbon.theme.mgt.services.AddCollection)getTestObject(org.wso2.carbon.theme.mgt.services.AddCollection.class);
                    // TODO : Fill in the addCollection341 here
                

                stub.startaddCollection(
                         addCollection341,
                    new tempCallbackN10134()
                );
              


        }

        private class tempCallbackN10134  extends org.wso2.carbon.theme.mgt.services.ThemeMgtServiceCallbackHandler{
            public tempCallbackN10134(){ super(null);}

            public void receiveResultaddCollection(
                         org.wso2.carbon.theme.mgt.services.AddCollectionResponse result
                            ) {
                
            }

            public void receiveErroraddCollection(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetAllThemes() throws java.lang.Exception{

        org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub =
                    new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.theme.mgt.services.GetAllThemes getAllThemes343=
                                                        (org.wso2.carbon.theme.mgt.services.GetAllThemes)getTestObject(org.wso2.carbon.theme.mgt.services.GetAllThemes.class);
                    // TODO : Fill in the getAllThemes343 here
                
                        assertNotNull(stub.getAllThemes(
                        getAllThemes343));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetAllThemes() throws java.lang.Exception{
            org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub = new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();
             org.wso2.carbon.theme.mgt.services.GetAllThemes getAllThemes343=
                                                        (org.wso2.carbon.theme.mgt.services.GetAllThemes)getTestObject(org.wso2.carbon.theme.mgt.services.GetAllThemes.class);
                    // TODO : Fill in the getAllThemes343 here
                

                stub.startgetAllThemes(
                         getAllThemes343,
                    new tempCallbackN10171()
                );
              


        }

        private class tempCallbackN10171  extends org.wso2.carbon.theme.mgt.services.ThemeMgtServiceCallbackHandler{
            public tempCallbackN10171(){ super(null);}

            public void receiveResultgetAllThemes(
                         org.wso2.carbon.theme.mgt.services.GetAllThemesResponse result
                            ) {
                
            }

            public void receiveErrorgetAllThemes(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testupdateTextContent() throws java.lang.Exception{

        org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub =
                    new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.theme.mgt.services.UpdateTextContent updateTextContent345=
                                                        (org.wso2.carbon.theme.mgt.services.UpdateTextContent)getTestObject(org.wso2.carbon.theme.mgt.services.UpdateTextContent.class);
                    // TODO : Fill in the updateTextContent345 here
                
                    
                    //There is no output to be tested!
                    stub.updateTextContent(
                        updateTextContent345);
                    



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartupdateTextContent() throws java.lang.Exception{
            org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub = new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();
             org.wso2.carbon.theme.mgt.services.UpdateTextContent updateTextContent345=
                                                        (org.wso2.carbon.theme.mgt.services.UpdateTextContent)getTestObject(org.wso2.carbon.theme.mgt.services.UpdateTextContent.class);
                    // TODO : Fill in the updateTextContent345 here
                

                stub.startupdateTextContent(
                         updateTextContent345,
                    new tempCallbackN101AE()
                );
              


        }

        private class tempCallbackN101AE  extends org.wso2.carbon.theme.mgt.services.ThemeMgtServiceCallbackHandler{
            public tempCallbackN101AE(){ super(null);}

            public void receiveResultupdateTextContent(
                         ) {
                
            }

            public void receiveErrorupdateTextContent(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetContentBean() throws java.lang.Exception{

        org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub =
                    new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.theme.mgt.services.GetContentBean getContentBean347=
                                                        (org.wso2.carbon.theme.mgt.services.GetContentBean)getTestObject(org.wso2.carbon.theme.mgt.services.GetContentBean.class);
                    // TODO : Fill in the getContentBean347 here
                
                        assertNotNull(stub.getContentBean(
                        getContentBean347));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetContentBean() throws java.lang.Exception{
            org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub = new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();
             org.wso2.carbon.theme.mgt.services.GetContentBean getContentBean347=
                                                        (org.wso2.carbon.theme.mgt.services.GetContentBean)getTestObject(org.wso2.carbon.theme.mgt.services.GetContentBean.class);
                    // TODO : Fill in the getContentBean347 here
                

                stub.startgetContentBean(
                         getContentBean347,
                    new tempCallbackN101E8()
                );
              


        }

        private class tempCallbackN101E8  extends org.wso2.carbon.theme.mgt.services.ThemeMgtServiceCallbackHandler{
            public tempCallbackN101E8(){ super(null);}

            public void receiveResultgetContentBean(
                         org.wso2.carbon.theme.mgt.services.GetContentBeanResponse result
                            ) {
                
            }

            public void receiveErrorgetContentBean(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testapplyTheme() throws java.lang.Exception{

        org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub =
                    new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.theme.mgt.services.ApplyTheme applyTheme349=
                                                        (org.wso2.carbon.theme.mgt.services.ApplyTheme)getTestObject(org.wso2.carbon.theme.mgt.services.ApplyTheme.class);
                    // TODO : Fill in the applyTheme349 here
                
                    
                    //There is no output to be tested!
                    stub.applyTheme(
                        applyTheme349);
                    



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartapplyTheme() throws java.lang.Exception{
            org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub = new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();
             org.wso2.carbon.theme.mgt.services.ApplyTheme applyTheme349=
                                                        (org.wso2.carbon.theme.mgt.services.ApplyTheme)getTestObject(org.wso2.carbon.theme.mgt.services.ApplyTheme.class);
                    // TODO : Fill in the applyTheme349 here
                

                stub.startapplyTheme(
                         applyTheme349,
                    new tempCallbackN10225()
                );
              


        }

        private class tempCallbackN10225  extends org.wso2.carbon.theme.mgt.services.ThemeMgtServiceCallbackHandler{
            public tempCallbackN10225(){ super(null);}

            public void receiveResultapplyTheme(
                         ) {
                
            }

            public void receiveErrorapplyTheme(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetAllPaths() throws java.lang.Exception{

        org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub =
                    new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.theme.mgt.services.GetAllPaths getAllPaths351=
                                                        (org.wso2.carbon.theme.mgt.services.GetAllPaths)getTestObject(org.wso2.carbon.theme.mgt.services.GetAllPaths.class);
                    // TODO : Fill in the getAllPaths351 here
                
                        assertNotNull(stub.getAllPaths(
                        getAllPaths351));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetAllPaths() throws java.lang.Exception{
            org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub = new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();
             org.wso2.carbon.theme.mgt.services.GetAllPaths getAllPaths351=
                                                        (org.wso2.carbon.theme.mgt.services.GetAllPaths)getTestObject(org.wso2.carbon.theme.mgt.services.GetAllPaths.class);
                    // TODO : Fill in the getAllPaths351 here
                

                stub.startgetAllPaths(
                         getAllPaths351,
                    new tempCallbackN1025F()
                );
              


        }

        private class tempCallbackN1025F  extends org.wso2.carbon.theme.mgt.services.ThemeMgtServiceCallbackHandler{
            public tempCallbackN1025F(){ super(null);}

            public void receiveResultgetAllPaths(
                         org.wso2.carbon.theme.mgt.services.GetAllPathsResponse result
                            ) {
                
            }

            public void receiveErrorgetAllPaths(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetSessionResourcePath() throws java.lang.Exception{

        org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub =
                    new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.theme.mgt.services.GetSessionResourcePath getSessionResourcePath353=
                                                        (org.wso2.carbon.theme.mgt.services.GetSessionResourcePath)getTestObject(org.wso2.carbon.theme.mgt.services.GetSessionResourcePath.class);
                    // TODO : Fill in the getSessionResourcePath353 here
                
                        assertNotNull(stub.getSessionResourcePath(
                        getSessionResourcePath353));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetSessionResourcePath() throws java.lang.Exception{
            org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub = new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();
             org.wso2.carbon.theme.mgt.services.GetSessionResourcePath getSessionResourcePath353=
                                                        (org.wso2.carbon.theme.mgt.services.GetSessionResourcePath)getTestObject(org.wso2.carbon.theme.mgt.services.GetSessionResourcePath.class);
                    // TODO : Fill in the getSessionResourcePath353 here
                

                stub.startgetSessionResourcePath(
                         getSessionResourcePath353,
                    new tempCallbackN1029C()
                );
              


        }

        private class tempCallbackN1029C  extends org.wso2.carbon.theme.mgt.services.ThemeMgtServiceCallbackHandler{
            public tempCallbackN1029C(){ super(null);}

            public void receiveResultgetSessionResourcePath(
                         org.wso2.carbon.theme.mgt.services.GetSessionResourcePathResponse result
                            ) {
                
            }

            public void receiveErrorgetSessionResourcePath(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testimportResource() throws java.lang.Exception{

        org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub =
                    new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.theme.mgt.services.ImportResource importResource355=
                                                        (org.wso2.carbon.theme.mgt.services.ImportResource)getTestObject(org.wso2.carbon.theme.mgt.services.ImportResource.class);
                    // TODO : Fill in the importResource355 here
                
                    
                    //There is no output to be tested!
                    stub.importResource(
                        importResource355);
                    



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartimportResource() throws java.lang.Exception{
            org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub = new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();
             org.wso2.carbon.theme.mgt.services.ImportResource importResource355=
                                                        (org.wso2.carbon.theme.mgt.services.ImportResource)getTestObject(org.wso2.carbon.theme.mgt.services.ImportResource.class);
                    // TODO : Fill in the importResource355 here
                

                stub.startimportResource(
                         importResource355,
                    new tempCallbackN102D9()
                );
              


        }

        private class tempCallbackN102D9  extends org.wso2.carbon.theme.mgt.services.ThemeMgtServiceCallbackHandler{
            public tempCallbackN102D9(){ super(null);}

            public void receiveResultimportResource(
                         ) {
                
            }

            public void receiveErrorimportResource(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetResourceData() throws java.lang.Exception{

        org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub =
                    new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.theme.mgt.services.GetResourceData getResourceData357=
                                                        (org.wso2.carbon.theme.mgt.services.GetResourceData)getTestObject(org.wso2.carbon.theme.mgt.services.GetResourceData.class);
                    // TODO : Fill in the getResourceData357 here
                
                        assertNotNull(stub.getResourceData(
                        getResourceData357));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetResourceData() throws java.lang.Exception{
            org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub = new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();
             org.wso2.carbon.theme.mgt.services.GetResourceData getResourceData357=
                                                        (org.wso2.carbon.theme.mgt.services.GetResourceData)getTestObject(org.wso2.carbon.theme.mgt.services.GetResourceData.class);
                    // TODO : Fill in the getResourceData357 here
                

                stub.startgetResourceData(
                         getResourceData357,
                    new tempCallbackN10313()
                );
              


        }

        private class tempCallbackN10313  extends org.wso2.carbon.theme.mgt.services.ThemeMgtServiceCallbackHandler{
            public tempCallbackN10313(){ super(null);}

            public void receiveResultgetResourceData(
                         org.wso2.carbon.theme.mgt.services.GetResourceDataResponse result
                            ) {
                
            }

            public void receiveErrorgetResourceData(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetCollectionContent() throws java.lang.Exception{

        org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub =
                    new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.theme.mgt.services.GetCollectionContent getCollectionContent359=
                                                        (org.wso2.carbon.theme.mgt.services.GetCollectionContent)getTestObject(org.wso2.carbon.theme.mgt.services.GetCollectionContent.class);
                    // TODO : Fill in the getCollectionContent359 here
                
                        assertNotNull(stub.getCollectionContent(
                        getCollectionContent359));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetCollectionContent() throws java.lang.Exception{
            org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub = new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();
             org.wso2.carbon.theme.mgt.services.GetCollectionContent getCollectionContent359=
                                                        (org.wso2.carbon.theme.mgt.services.GetCollectionContent)getTestObject(org.wso2.carbon.theme.mgt.services.GetCollectionContent.class);
                    // TODO : Fill in the getCollectionContent359 here
                

                stub.startgetCollectionContent(
                         getCollectionContent359,
                    new tempCallbackN10350()
                );
              


        }

        private class tempCallbackN10350  extends org.wso2.carbon.theme.mgt.services.ThemeMgtServiceCallbackHandler{
            public tempCallbackN10350(){ super(null);}

            public void receiveResultgetCollectionContent(
                         org.wso2.carbon.theme.mgt.services.GetCollectionContentResponse result
                            ) {
                
            }

            public void receiveErrorgetCollectionContent(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testaddTextResource() throws java.lang.Exception{

        org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub =
                    new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.theme.mgt.services.AddTextResource addTextResource361=
                                                        (org.wso2.carbon.theme.mgt.services.AddTextResource)getTestObject(org.wso2.carbon.theme.mgt.services.AddTextResource.class);
                    // TODO : Fill in the addTextResource361 here
                
                    
                    //There is no output to be tested!
                    stub.addTextResource(
                        addTextResource361);
                    



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartaddTextResource() throws java.lang.Exception{
            org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub = new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();
             org.wso2.carbon.theme.mgt.services.AddTextResource addTextResource361=
                                                        (org.wso2.carbon.theme.mgt.services.AddTextResource)getTestObject(org.wso2.carbon.theme.mgt.services.AddTextResource.class);
                    // TODO : Fill in the addTextResource361 here
                

                stub.startaddTextResource(
                         addTextResource361,
                    new tempCallbackN1038D()
                );
              


        }

        private class tempCallbackN1038D  extends org.wso2.carbon.theme.mgt.services.ThemeMgtServiceCallbackHandler{
            public tempCallbackN1038D(){ super(null);}

            public void receiveResultaddTextResource(
                         ) {
                
            }

            public void receiveErroraddTextResource(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetTextContent() throws java.lang.Exception{

        org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub =
                    new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.theme.mgt.services.GetTextContent getTextContent363=
                                                        (org.wso2.carbon.theme.mgt.services.GetTextContent)getTestObject(org.wso2.carbon.theme.mgt.services.GetTextContent.class);
                    // TODO : Fill in the getTextContent363 here
                
                        assertNotNull(stub.getTextContent(
                        getTextContent363));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetTextContent() throws java.lang.Exception{
            org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub = new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();
             org.wso2.carbon.theme.mgt.services.GetTextContent getTextContent363=
                                                        (org.wso2.carbon.theme.mgt.services.GetTextContent)getTestObject(org.wso2.carbon.theme.mgt.services.GetTextContent.class);
                    // TODO : Fill in the getTextContent363 here
                

                stub.startgetTextContent(
                         getTextContent363,
                    new tempCallbackN103C7()
                );
              


        }

        private class tempCallbackN103C7  extends org.wso2.carbon.theme.mgt.services.ThemeMgtServiceCallbackHandler{
            public tempCallbackN103C7(){ super(null);}

            public void receiveResultgetTextContent(
                         org.wso2.carbon.theme.mgt.services.GetTextContentResponse result
                            ) {
                
            }

            public void receiveErrorgetTextContent(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetResourceTreeEntry() throws java.lang.Exception{

        org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub =
                    new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.theme.mgt.services.GetResourceTreeEntry getResourceTreeEntry365=
                                                        (org.wso2.carbon.theme.mgt.services.GetResourceTreeEntry)getTestObject(org.wso2.carbon.theme.mgt.services.GetResourceTreeEntry.class);
                    // TODO : Fill in the getResourceTreeEntry365 here
                
                        assertNotNull(stub.getResourceTreeEntry(
                        getResourceTreeEntry365));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetResourceTreeEntry() throws java.lang.Exception{
            org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub stub = new org.wso2.carbon.theme.mgt.services.ThemeMgtServiceStub();
             org.wso2.carbon.theme.mgt.services.GetResourceTreeEntry getResourceTreeEntry365=
                                                        (org.wso2.carbon.theme.mgt.services.GetResourceTreeEntry)getTestObject(org.wso2.carbon.theme.mgt.services.GetResourceTreeEntry.class);
                    // TODO : Fill in the getResourceTreeEntry365 here
                

                stub.startgetResourceTreeEntry(
                         getResourceTreeEntry365,
                    new tempCallbackN10404()
                );
              


        }

        private class tempCallbackN10404  extends org.wso2.carbon.theme.mgt.services.ThemeMgtServiceCallbackHandler{
            public tempCallbackN10404(){ super(null);}

            public void receiveResultgetResourceTreeEntry(
                         org.wso2.carbon.theme.mgt.services.GetResourceTreeEntryResponse result
                            ) {
                
            }

            public void receiveErrorgetResourceTreeEntry(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    
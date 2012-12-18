

/**
 * UsageServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.usage.services;

    /*
     *  UsageServiceTest Junit test case
    */

    public class UsageServiceTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testretrievePaginatedInstanceUsage() throws java.lang.Exception{

        org.wso2.carbon.usage.services.UsageServiceStub stub =
                    new org.wso2.carbon.usage.services.UsageServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.usage.services.RetrievePaginatedInstanceUsage retrievePaginatedInstanceUsage126=
                                                        (org.wso2.carbon.usage.services.RetrievePaginatedInstanceUsage)getTestObject(org.wso2.carbon.usage.services.RetrievePaginatedInstanceUsage.class);
                    // TODO : Fill in the retrievePaginatedInstanceUsage126 here
                
                        assertNotNull(stub.retrievePaginatedInstanceUsage(
                        retrievePaginatedInstanceUsage126));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartretrievePaginatedInstanceUsage() throws java.lang.Exception{
            org.wso2.carbon.usage.services.UsageServiceStub stub = new org.wso2.carbon.usage.services.UsageServiceStub();
             org.wso2.carbon.usage.services.RetrievePaginatedInstanceUsage retrievePaginatedInstanceUsage126=
                                                        (org.wso2.carbon.usage.services.RetrievePaginatedInstanceUsage)getTestObject(org.wso2.carbon.usage.services.RetrievePaginatedInstanceUsage.class);
                    // TODO : Fill in the retrievePaginatedInstanceUsage126 here
                

                stub.startretrievePaginatedInstanceUsage(
                         retrievePaginatedInstanceUsage126,
                    new tempCallbackN1000C()
                );
              


        }

        private class tempCallbackN1000C  extends org.wso2.carbon.usage.services.UsageServiceCallbackHandler{
            public tempCallbackN1000C(){ super(null);}

            public void receiveResultretrievePaginatedInstanceUsage(
                         org.wso2.carbon.usage.services.RetrievePaginatedInstanceUsageResponse result
                            ) {
                
            }

            public void receiveErrorretrievePaginatedInstanceUsage(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testretrieveInstanceUsage() throws java.lang.Exception{

        org.wso2.carbon.usage.services.UsageServiceStub stub =
                    new org.wso2.carbon.usage.services.UsageServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.usage.services.RetrieveInstanceUsage retrieveInstanceUsage128=
                                                        (org.wso2.carbon.usage.services.RetrieveInstanceUsage)getTestObject(org.wso2.carbon.usage.services.RetrieveInstanceUsage.class);
                    // TODO : Fill in the retrieveInstanceUsage128 here
                
                        assertNotNull(stub.retrieveInstanceUsage(
                        retrieveInstanceUsage128));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartretrieveInstanceUsage() throws java.lang.Exception{
            org.wso2.carbon.usage.services.UsageServiceStub stub = new org.wso2.carbon.usage.services.UsageServiceStub();
             org.wso2.carbon.usage.services.RetrieveInstanceUsage retrieveInstanceUsage128=
                                                        (org.wso2.carbon.usage.services.RetrieveInstanceUsage)getTestObject(org.wso2.carbon.usage.services.RetrieveInstanceUsage.class);
                    // TODO : Fill in the retrieveInstanceUsage128 here
                

                stub.startretrieveInstanceUsage(
                         retrieveInstanceUsage128,
                    new tempCallbackN10049()
                );
              


        }

        private class tempCallbackN10049  extends org.wso2.carbon.usage.services.UsageServiceCallbackHandler{
            public tempCallbackN10049(){ super(null);}

            public void receiveResultretrieveInstanceUsage(
                         org.wso2.carbon.usage.services.RetrieveInstanceUsageResponse result
                            ) {
                
            }

            public void receiveErrorretrieveInstanceUsage(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testretrieveTenantUsages() throws java.lang.Exception{

        org.wso2.carbon.usage.services.UsageServiceStub stub =
                    new org.wso2.carbon.usage.services.UsageServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.usage.services.RetrieveTenantUsages retrieveTenantUsages130=
                                                        (org.wso2.carbon.usage.services.RetrieveTenantUsages)getTestObject(org.wso2.carbon.usage.services.RetrieveTenantUsages.class);
                    // TODO : Fill in the retrieveTenantUsages130 here
                
                        assertNotNull(stub.retrieveTenantUsages(
                        retrieveTenantUsages130));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartretrieveTenantUsages() throws java.lang.Exception{
            org.wso2.carbon.usage.services.UsageServiceStub stub = new org.wso2.carbon.usage.services.UsageServiceStub();
             org.wso2.carbon.usage.services.RetrieveTenantUsages retrieveTenantUsages130=
                                                        (org.wso2.carbon.usage.services.RetrieveTenantUsages)getTestObject(org.wso2.carbon.usage.services.RetrieveTenantUsages.class);
                    // TODO : Fill in the retrieveTenantUsages130 here
                

                stub.startretrieveTenantUsages(
                         retrieveTenantUsages130,
                    new tempCallbackN10086()
                );
              


        }

        private class tempCallbackN10086  extends org.wso2.carbon.usage.services.UsageServiceCallbackHandler{
            public tempCallbackN10086(){ super(null);}

            public void receiveResultretrieveTenantUsages(
                         org.wso2.carbon.usage.services.RetrieveTenantUsagesResponse result
                            ) {
                
            }

            public void receiveErrorretrieveTenantUsages(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetValidUsageEntry() throws java.lang.Exception{

        org.wso2.carbon.usage.services.UsageServiceStub stub =
                    new org.wso2.carbon.usage.services.UsageServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.usage.services.GetValidUsageEntry getValidUsageEntry132=
                                                        (org.wso2.carbon.usage.services.GetValidUsageEntry)getTestObject(org.wso2.carbon.usage.services.GetValidUsageEntry.class);
                    // TODO : Fill in the getValidUsageEntry132 here
                
                        assertNotNull(stub.getValidUsageEntry(
                        getValidUsageEntry132));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetValidUsageEntry() throws java.lang.Exception{
            org.wso2.carbon.usage.services.UsageServiceStub stub = new org.wso2.carbon.usage.services.UsageServiceStub();
             org.wso2.carbon.usage.services.GetValidUsageEntry getValidUsageEntry132=
                                                        (org.wso2.carbon.usage.services.GetValidUsageEntry)getTestObject(org.wso2.carbon.usage.services.GetValidUsageEntry.class);
                    // TODO : Fill in the getValidUsageEntry132 here
                

                stub.startgetValidUsageEntry(
                         getValidUsageEntry132,
                    new tempCallbackN100C3()
                );
              


        }

        private class tempCallbackN100C3  extends org.wso2.carbon.usage.services.UsageServiceCallbackHandler{
            public tempCallbackN100C3(){ super(null);}

            public void receiveResultgetValidUsageEntry(
                         org.wso2.carbon.usage.services.GetValidUsageEntryResponse result
                            ) {
                
            }

            public void receiveErrorgetValidUsageEntry(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testretrieveCurrentTenantUsage() throws java.lang.Exception{

        org.wso2.carbon.usage.services.UsageServiceStub stub =
                    new org.wso2.carbon.usage.services.UsageServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.usage.services.RetrieveCurrentTenantUsage retrieveCurrentTenantUsage134=
                                                        (org.wso2.carbon.usage.services.RetrieveCurrentTenantUsage)getTestObject(org.wso2.carbon.usage.services.RetrieveCurrentTenantUsage.class);
                    // TODO : Fill in the retrieveCurrentTenantUsage134 here
                
                        assertNotNull(stub.retrieveCurrentTenantUsage(
                        retrieveCurrentTenantUsage134));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartretrieveCurrentTenantUsage() throws java.lang.Exception{
            org.wso2.carbon.usage.services.UsageServiceStub stub = new org.wso2.carbon.usage.services.UsageServiceStub();
             org.wso2.carbon.usage.services.RetrieveCurrentTenantUsage retrieveCurrentTenantUsage134=
                                                        (org.wso2.carbon.usage.services.RetrieveCurrentTenantUsage)getTestObject(org.wso2.carbon.usage.services.RetrieveCurrentTenantUsage.class);
                    // TODO : Fill in the retrieveCurrentTenantUsage134 here
                

                stub.startretrieveCurrentTenantUsage(
                         retrieveCurrentTenantUsage134,
                    new tempCallbackN100EC()
                );
              


        }

        private class tempCallbackN100EC  extends org.wso2.carbon.usage.services.UsageServiceCallbackHandler{
            public tempCallbackN100EC(){ super(null);}

            public void receiveResultretrieveCurrentTenantUsage(
                         org.wso2.carbon.usage.services.RetrieveCurrentTenantUsageResponse result
                            ) {
                
            }

            public void receiveErrorretrieveCurrentTenantUsage(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testretrieveTenantUsage() throws java.lang.Exception{

        org.wso2.carbon.usage.services.UsageServiceStub stub =
                    new org.wso2.carbon.usage.services.UsageServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.usage.services.RetrieveTenantUsage retrieveTenantUsage136=
                                                        (org.wso2.carbon.usage.services.RetrieveTenantUsage)getTestObject(org.wso2.carbon.usage.services.RetrieveTenantUsage.class);
                    // TODO : Fill in the retrieveTenantUsage136 here
                
                        assertNotNull(stub.retrieveTenantUsage(
                        retrieveTenantUsage136));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartretrieveTenantUsage() throws java.lang.Exception{
            org.wso2.carbon.usage.services.UsageServiceStub stub = new org.wso2.carbon.usage.services.UsageServiceStub();
             org.wso2.carbon.usage.services.RetrieveTenantUsage retrieveTenantUsage136=
                                                        (org.wso2.carbon.usage.services.RetrieveTenantUsage)getTestObject(org.wso2.carbon.usage.services.RetrieveTenantUsage.class);
                    // TODO : Fill in the retrieveTenantUsage136 here
                

                stub.startretrieveTenantUsage(
                         retrieveTenantUsage136,
                    new tempCallbackN10129()
                );
              


        }

        private class tempCallbackN10129  extends org.wso2.carbon.usage.services.UsageServiceCallbackHandler{
            public tempCallbackN10129(){ super(null);}

            public void receiveResultretrieveTenantUsage(
                         org.wso2.carbon.usage.services.RetrieveTenantUsageResponse result
                            ) {
                
            }

            public void receiveErrorretrieveTenantUsage(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testretrievePaginatedTenantUsages() throws java.lang.Exception{

        org.wso2.carbon.usage.services.UsageServiceStub stub =
                    new org.wso2.carbon.usage.services.UsageServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.usage.services.RetrievePaginatedTenantUsages retrievePaginatedTenantUsages138=
                                                        (org.wso2.carbon.usage.services.RetrievePaginatedTenantUsages)getTestObject(org.wso2.carbon.usage.services.RetrievePaginatedTenantUsages.class);
                    // TODO : Fill in the retrievePaginatedTenantUsages138 here
                
                        assertNotNull(stub.retrievePaginatedTenantUsages(
                        retrievePaginatedTenantUsages138));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartretrievePaginatedTenantUsages() throws java.lang.Exception{
            org.wso2.carbon.usage.services.UsageServiceStub stub = new org.wso2.carbon.usage.services.UsageServiceStub();
             org.wso2.carbon.usage.services.RetrievePaginatedTenantUsages retrievePaginatedTenantUsages138=
                                                        (org.wso2.carbon.usage.services.RetrievePaginatedTenantUsages)getTestObject(org.wso2.carbon.usage.services.RetrievePaginatedTenantUsages.class);
                    // TODO : Fill in the retrievePaginatedTenantUsages138 here
                

                stub.startretrievePaginatedTenantUsages(
                         retrievePaginatedTenantUsages138,
                    new tempCallbackN10166()
                );
              


        }

        private class tempCallbackN10166  extends org.wso2.carbon.usage.services.UsageServiceCallbackHandler{
            public tempCallbackN10166(){ super(null);}

            public void receiveResultretrievePaginatedTenantUsages(
                         org.wso2.carbon.usage.services.RetrievePaginatedTenantUsagesResponse result
                            ) {
                
            }

            public void receiveErrorretrievePaginatedTenantUsages(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    
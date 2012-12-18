

/**
 * MeteringQueryDSTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.ws.dataservice;

    /*
     *  MeteringQueryDSTest Junit test case
    */

    public class MeteringQueryDSTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testgetRegistryBandwidthUsageStats() throws java.lang.Exception{

        org.wso2.ws.dataservice.MeteringQueryDSStub stub =
                    new org.wso2.ws.dataservice.MeteringQueryDSStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.bam.GetRegistryBandwidthUsageStats getRegistryBandwidthUsageStats129=
                                                        (org.wso2.carbon.bam.GetRegistryBandwidthUsageStats)getTestObject(org.wso2.carbon.bam.GetRegistryBandwidthUsageStats.class);
                    // TODO : Fill in the getRegistryBandwidthUsageStats129 here
                
                        assertNotNull(stub.getRegistryBandwidthUsageStats(
                        getRegistryBandwidthUsageStats129));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetRegistryBandwidthUsageStats() throws java.lang.Exception{
            org.wso2.ws.dataservice.MeteringQueryDSStub stub = new org.wso2.ws.dataservice.MeteringQueryDSStub();
             org.wso2.carbon.bam.GetRegistryBandwidthUsageStats getRegistryBandwidthUsageStats129=
                                                        (org.wso2.carbon.bam.GetRegistryBandwidthUsageStats)getTestObject(org.wso2.carbon.bam.GetRegistryBandwidthUsageStats.class);
                    // TODO : Fill in the getRegistryBandwidthUsageStats129 here
                

                stub.startgetRegistryBandwidthUsageStats(
                         getRegistryBandwidthUsageStats129,
                    new tempCallbackN1000C()
                );
              


        }

        private class tempCallbackN1000C  extends org.wso2.ws.dataservice.MeteringQueryDSCallbackHandler{
            public tempCallbackN1000C(){ super(null);}

            public void receiveResultgetRegistryBandwidthUsageStats(
                         org.wso2.carbon.bam.RegBandwidthStatsE result
                            ) {
                
            }

            public void receiveErrorgetRegistryBandwidthUsageStats(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetHourlyServiceRequestStats() throws java.lang.Exception{

        org.wso2.ws.dataservice.MeteringQueryDSStub stub =
                    new org.wso2.ws.dataservice.MeteringQueryDSStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.bam.GetHourlyServiceRequestStats getHourlyServiceRequestStats131=
                                                        (org.wso2.carbon.bam.GetHourlyServiceRequestStats)getTestObject(org.wso2.carbon.bam.GetHourlyServiceRequestStats.class);
                    // TODO : Fill in the getHourlyServiceRequestStats131 here
                
                        assertNotNull(stub.getHourlyServiceRequestStats(
                        getHourlyServiceRequestStats131));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetHourlyServiceRequestStats() throws java.lang.Exception{
            org.wso2.ws.dataservice.MeteringQueryDSStub stub = new org.wso2.ws.dataservice.MeteringQueryDSStub();
             org.wso2.carbon.bam.GetHourlyServiceRequestStats getHourlyServiceRequestStats131=
                                                        (org.wso2.carbon.bam.GetHourlyServiceRequestStats)getTestObject(org.wso2.carbon.bam.GetHourlyServiceRequestStats.class);
                    // TODO : Fill in the getHourlyServiceRequestStats131 here
                

                stub.startgetHourlyServiceRequestStats(
                         getHourlyServiceRequestStats131,
                    new tempCallbackN10049()
                );
              


        }

        private class tempCallbackN10049  extends org.wso2.ws.dataservice.MeteringQueryDSCallbackHandler{
            public tempCallbackN10049(){ super(null);}

            public void receiveResultgetHourlyServiceRequestStats(
                         org.wso2.carbon.bam.ServiceRequestStatsE result
                            ) {
                
            }

            public void receiveErrorgetHourlyServiceRequestStats(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetDailyRegistryBandwidthUsageStats() throws java.lang.Exception{

        org.wso2.ws.dataservice.MeteringQueryDSStub stub =
                    new org.wso2.ws.dataservice.MeteringQueryDSStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.bam.GetDailyRegistryBandwidthUsageStats getDailyRegistryBandwidthUsageStats133=
                                                        (org.wso2.carbon.bam.GetDailyRegistryBandwidthUsageStats)getTestObject(org.wso2.carbon.bam.GetDailyRegistryBandwidthUsageStats.class);
                    // TODO : Fill in the getDailyRegistryBandwidthUsageStats133 here
                
                        assertNotNull(stub.getDailyRegistryBandwidthUsageStats(
                        getDailyRegistryBandwidthUsageStats133));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetDailyRegistryBandwidthUsageStats() throws java.lang.Exception{
            org.wso2.ws.dataservice.MeteringQueryDSStub stub = new org.wso2.ws.dataservice.MeteringQueryDSStub();
             org.wso2.carbon.bam.GetDailyRegistryBandwidthUsageStats getDailyRegistryBandwidthUsageStats133=
                                                        (org.wso2.carbon.bam.GetDailyRegistryBandwidthUsageStats)getTestObject(org.wso2.carbon.bam.GetDailyRegistryBandwidthUsageStats.class);
                    // TODO : Fill in the getDailyRegistryBandwidthUsageStats133 here
                

                stub.startgetDailyRegistryBandwidthUsageStats(
                         getDailyRegistryBandwidthUsageStats133,
                    new tempCallbackN10086()
                );
              


        }

        private class tempCallbackN10086  extends org.wso2.ws.dataservice.MeteringQueryDSCallbackHandler{
            public tempCallbackN10086(){ super(null);}

            public void receiveResultgetDailyRegistryBandwidthUsageStats(
                         org.wso2.carbon.bam.RegBandwidthStatsE result
                            ) {
                
            }

            public void receiveErrorgetDailyRegistryBandwidthUsageStats(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetHourlyBandwidthStats() throws java.lang.Exception{

        org.wso2.ws.dataservice.MeteringQueryDSStub stub =
                    new org.wso2.ws.dataservice.MeteringQueryDSStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.bam.GetHourlyBandwidthStats getHourlyBandwidthStats135=
                                                        (org.wso2.carbon.bam.GetHourlyBandwidthStats)getTestObject(org.wso2.carbon.bam.GetHourlyBandwidthStats.class);
                    // TODO : Fill in the getHourlyBandwidthStats135 here
                
                        assertNotNull(stub.getHourlyBandwidthStats(
                        getHourlyBandwidthStats135));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetHourlyBandwidthStats() throws java.lang.Exception{
            org.wso2.ws.dataservice.MeteringQueryDSStub stub = new org.wso2.ws.dataservice.MeteringQueryDSStub();
             org.wso2.carbon.bam.GetHourlyBandwidthStats getHourlyBandwidthStats135=
                                                        (org.wso2.carbon.bam.GetHourlyBandwidthStats)getTestObject(org.wso2.carbon.bam.GetHourlyBandwidthStats.class);
                    // TODO : Fill in the getHourlyBandwidthStats135 here
                

                stub.startgetHourlyBandwidthStats(
                         getHourlyBandwidthStats135,
                    new tempCallbackN100C3()
                );
              


        }

        private class tempCallbackN100C3  extends org.wso2.ws.dataservice.MeteringQueryDSCallbackHandler{
            public tempCallbackN100C3(){ super(null);}

            public void receiveResultgetHourlyBandwidthStats(
                         org.wso2.carbon.bam.BandwidthStatsE result
                            ) {
                
            }

            public void receiveErrorgetHourlyBandwidthStats(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetInstanceUsageStats() throws java.lang.Exception{

        org.wso2.ws.dataservice.MeteringQueryDSStub stub =
                    new org.wso2.ws.dataservice.MeteringQueryDSStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.bam.GetInstanceUsageStats getInstanceUsageStats137=
                                                        (org.wso2.carbon.bam.GetInstanceUsageStats)getTestObject(org.wso2.carbon.bam.GetInstanceUsageStats.class);
                    // TODO : Fill in the getInstanceUsageStats137 here
                
                        assertNotNull(stub.getInstanceUsageStats(
                        getInstanceUsageStats137));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetInstanceUsageStats() throws java.lang.Exception{
            org.wso2.ws.dataservice.MeteringQueryDSStub stub = new org.wso2.ws.dataservice.MeteringQueryDSStub();
             org.wso2.carbon.bam.GetInstanceUsageStats getInstanceUsageStats137=
                                                        (org.wso2.carbon.bam.GetInstanceUsageStats)getTestObject(org.wso2.carbon.bam.GetInstanceUsageStats.class);
                    // TODO : Fill in the getInstanceUsageStats137 here
                

                stub.startgetInstanceUsageStats(
                         getInstanceUsageStats137,
                    new tempCallbackN10100()
                );
              


        }

        private class tempCallbackN10100  extends org.wso2.ws.dataservice.MeteringQueryDSCallbackHandler{
            public tempCallbackN10100(){ super(null);}

            public void receiveResultgetInstanceUsageStats(
                         org.wso2.carbon.bam.InstanceUsageStatsE result
                            ) {
                
            }

            public void receiveErrorgetInstanceUsageStats(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetBandwidthStats() throws java.lang.Exception{

        org.wso2.ws.dataservice.MeteringQueryDSStub stub =
                    new org.wso2.ws.dataservice.MeteringQueryDSStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.bam.GetBandwidthStats getBandwidthStats139=
                                                        (org.wso2.carbon.bam.GetBandwidthStats)getTestObject(org.wso2.carbon.bam.GetBandwidthStats.class);
                    // TODO : Fill in the getBandwidthStats139 here
                
                        assertNotNull(stub.getBandwidthStats(
                        getBandwidthStats139));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetBandwidthStats() throws java.lang.Exception{
            org.wso2.ws.dataservice.MeteringQueryDSStub stub = new org.wso2.ws.dataservice.MeteringQueryDSStub();
             org.wso2.carbon.bam.GetBandwidthStats getBandwidthStats139=
                                                        (org.wso2.carbon.bam.GetBandwidthStats)getTestObject(org.wso2.carbon.bam.GetBandwidthStats.class);
                    // TODO : Fill in the getBandwidthStats139 here
                

                stub.startgetBandwidthStats(
                         getBandwidthStats139,
                    new tempCallbackN1013D()
                );
              


        }

        private class tempCallbackN1013D  extends org.wso2.ws.dataservice.MeteringQueryDSCallbackHandler{
            public tempCallbackN1013D(){ super(null);}

            public void receiveResultgetBandwidthStats(
                         org.wso2.carbon.bam.BandwidthStatsE result
                            ) {
                
            }

            public void receiveErrorgetBandwidthStats(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetServiceRequestStats() throws java.lang.Exception{

        org.wso2.ws.dataservice.MeteringQueryDSStub stub =
                    new org.wso2.ws.dataservice.MeteringQueryDSStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.bam.GetServiceRequestStats getServiceRequestStats141=
                                                        (org.wso2.carbon.bam.GetServiceRequestStats)getTestObject(org.wso2.carbon.bam.GetServiceRequestStats.class);
                    // TODO : Fill in the getServiceRequestStats141 here
                
                        assertNotNull(stub.getServiceRequestStats(
                        getServiceRequestStats141));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetServiceRequestStats() throws java.lang.Exception{
            org.wso2.ws.dataservice.MeteringQueryDSStub stub = new org.wso2.ws.dataservice.MeteringQueryDSStub();
             org.wso2.carbon.bam.GetServiceRequestStats getServiceRequestStats141=
                                                        (org.wso2.carbon.bam.GetServiceRequestStats)getTestObject(org.wso2.carbon.bam.GetServiceRequestStats.class);
                    // TODO : Fill in the getServiceRequestStats141 here
                

                stub.startgetServiceRequestStats(
                         getServiceRequestStats141,
                    new tempCallbackN1017A()
                );
              


        }

        private class tempCallbackN1017A  extends org.wso2.ws.dataservice.MeteringQueryDSCallbackHandler{
            public tempCallbackN1017A(){ super(null);}

            public void receiveResultgetServiceRequestStats(
                         org.wso2.carbon.bam.ServiceRequestStatsE result
                            ) {
                
            }

            public void receiveErrorgetServiceRequestStats(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    


/**
 * MeteringSummaryGenerationDSTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.ws.dataservice;

    /*
     *  MeteringSummaryGenerationDSTest Junit test case
    */

    public class MeteringSummaryGenerationDSTest extends junit.framework.TestCase{

     
          /**
          * Auto generated test method
          */
          public  void testaddBandwidthStatDailySummary() throws java.lang.Exception{

          org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub =
          new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();//the default implementation should point to the right endpoint
          org.wso2.ws.dataservice.AddBandwidthStatDailySummary addBandwidthStatDailySummary371=
                  (org.wso2.ws.dataservice.AddBandwidthStatDailySummary)getTestObject(org.wso2.ws.dataservice.AddBandwidthStatDailySummary.class);
                      // TODO : Fill in the addBandwidthStatDailySummary371 here
                  

                  //There is no output to be tested!
                  stub.addBandwidthStatDailySummary(
                  addBandwidthStatDailySummary371);

              
          }
      
        /**
         * Auto generated test method
         */
        public  void testgetDataForYearlySummary() throws java.lang.Exception{

        org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub =
                    new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.bam.GetDataForYearlySummary getDataForYearlySummary372=
                                                        (org.wso2.carbon.bam.GetDataForYearlySummary)getTestObject(org.wso2.carbon.bam.GetDataForYearlySummary.class);
                    // TODO : Fill in the getDataForYearlySummary372 here
                
                        assertNotNull(stub.getDataForYearlySummary(
                        getDataForYearlySummary372));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetDataForYearlySummary() throws java.lang.Exception{
            org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub = new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();
             org.wso2.carbon.bam.GetDataForYearlySummary getDataForYearlySummary372=
                                                        (org.wso2.carbon.bam.GetDataForYearlySummary)getTestObject(org.wso2.carbon.bam.GetDataForYearlySummary.class);
                    // TODO : Fill in the getDataForYearlySummary372 here
                

                stub.startgetDataForYearlySummary(
                         getDataForYearlySummary372,
                    new tempCallbackN1003C()
                );
              


        }

        private class tempCallbackN1003C  extends org.wso2.ws.dataservice.MeteringSummaryGenerationDSCallbackHandler{
            public tempCallbackN1003C(){ super(null);}

            public void receiveResultgetDataForYearlySummary(
                         org.wso2.carbon.bam.BandwidthStatValuesE result
                            ) {
                
            }

            public void receiveErrorgetDataForYearlySummary(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetRegistryHistoryBandwidthUsage() throws java.lang.Exception{

        org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub =
                    new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.bam.GetRegistryHistoryBandwidthUsage getRegistryHistoryBandwidthUsage374=
                                                        (org.wso2.carbon.bam.GetRegistryHistoryBandwidthUsage)getTestObject(org.wso2.carbon.bam.GetRegistryHistoryBandwidthUsage.class);
                    // TODO : Fill in the getRegistryHistoryBandwidthUsage374 here
                
                        assertNotNull(stub.getRegistryHistoryBandwidthUsage(
                        getRegistryHistoryBandwidthUsage374));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetRegistryHistoryBandwidthUsage() throws java.lang.Exception{
            org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub = new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();
             org.wso2.carbon.bam.GetRegistryHistoryBandwidthUsage getRegistryHistoryBandwidthUsage374=
                                                        (org.wso2.carbon.bam.GetRegistryHistoryBandwidthUsage)getTestObject(org.wso2.carbon.bam.GetRegistryHistoryBandwidthUsage.class);
                    // TODO : Fill in the getRegistryHistoryBandwidthUsage374 here
                

                stub.startgetRegistryHistoryBandwidthUsage(
                         getRegistryHistoryBandwidthUsage374,
                    new tempCallbackN10079()
                );
              


        }

        private class tempCallbackN10079  extends org.wso2.ws.dataservice.MeteringSummaryGenerationDSCallbackHandler{
            public tempCallbackN10079(){ super(null);}

            public void receiveResultgetRegistryHistoryBandwidthUsage(
                         org.wso2.carbon.bam.BandwidthUsagesE result
                            ) {
                
            }

            public void receiveErrorgetRegistryHistoryBandwidthUsage(java.lang.Exception e) {
                fail();
            }

        }
      
          /**
          * Auto generated test method
          */
          public  void testaddBandwidthStatHourlySummary() throws java.lang.Exception{

          org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub =
          new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();//the default implementation should point to the right endpoint
          org.wso2.ws.dataservice.AddBandwidthStatHourlySummary addBandwidthStatHourlySummary376=
                  (org.wso2.ws.dataservice.AddBandwidthStatHourlySummary)getTestObject(org.wso2.ws.dataservice.AddBandwidthStatHourlySummary.class);
                      // TODO : Fill in the addBandwidthStatHourlySummary376 here
                  

                  //There is no output to be tested!
                  stub.addBandwidthStatHourlySummary(
                  addBandwidthStatHourlySummary376);

              
          }
      
        /**
         * Auto generated test method
         */
        public  void testgetRegistryBandwidthUsage() throws java.lang.Exception{

        org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub =
                    new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.bam.GetRegistryBandwidthUsage getRegistryBandwidthUsage377=
                                                        (org.wso2.carbon.bam.GetRegistryBandwidthUsage)getTestObject(org.wso2.carbon.bam.GetRegistryBandwidthUsage.class);
                    // TODO : Fill in the getRegistryBandwidthUsage377 here
                
                        assertNotNull(stub.getRegistryBandwidthUsage(
                        getRegistryBandwidthUsage377));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetRegistryBandwidthUsage() throws java.lang.Exception{
            org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub = new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();
             org.wso2.carbon.bam.GetRegistryBandwidthUsage getRegistryBandwidthUsage377=
                                                        (org.wso2.carbon.bam.GetRegistryBandwidthUsage)getTestObject(org.wso2.carbon.bam.GetRegistryBandwidthUsage.class);
                    // TODO : Fill in the getRegistryBandwidthUsage377 here
                

                stub.startgetRegistryBandwidthUsage(
                         getRegistryBandwidthUsage377,
                    new tempCallbackN100E6()
                );
              


        }

        private class tempCallbackN100E6  extends org.wso2.ws.dataservice.MeteringSummaryGenerationDSCallbackHandler{
            public tempCallbackN100E6(){ super(null);}

            public void receiveResultgetRegistryBandwidthUsage(
                         org.wso2.carbon.bam.BandwidthUsagesE result
                            ) {
                
            }

            public void receiveErrorgetRegistryBandwidthUsage(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetDataForMonthlySummary() throws java.lang.Exception{

        org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub =
                    new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.bam.GetDataForMonthlySummary getDataForMonthlySummary379=
                                                        (org.wso2.carbon.bam.GetDataForMonthlySummary)getTestObject(org.wso2.carbon.bam.GetDataForMonthlySummary.class);
                    // TODO : Fill in the getDataForMonthlySummary379 here
                
                        assertNotNull(stub.getDataForMonthlySummary(
                        getDataForMonthlySummary379));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetDataForMonthlySummary() throws java.lang.Exception{
            org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub = new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();
             org.wso2.carbon.bam.GetDataForMonthlySummary getDataForMonthlySummary379=
                                                        (org.wso2.carbon.bam.GetDataForMonthlySummary)getTestObject(org.wso2.carbon.bam.GetDataForMonthlySummary.class);
                    // TODO : Fill in the getDataForMonthlySummary379 here
                

                stub.startgetDataForMonthlySummary(
                         getDataForMonthlySummary379,
                    new tempCallbackN10123()
                );
              


        }

        private class tempCallbackN10123  extends org.wso2.ws.dataservice.MeteringSummaryGenerationDSCallbackHandler{
            public tempCallbackN10123(){ super(null);}

            public void receiveResultgetDataForMonthlySummary(
                         org.wso2.carbon.bam.BandwidthStatValuesE result
                            ) {
                
            }

            public void receiveErrorgetDataForMonthlySummary(java.lang.Exception e) {
                fail();
            }

        }
      
          /**
          * Auto generated test method
          */
          public  void testaddBandwidthStatYearlySummary() throws java.lang.Exception{

          org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub =
          new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();//the default implementation should point to the right endpoint
          org.wso2.ws.dataservice.AddBandwidthStatYearlySummary addBandwidthStatYearlySummary381=
                  (org.wso2.ws.dataservice.AddBandwidthStatYearlySummary)getTestObject(org.wso2.ws.dataservice.AddBandwidthStatYearlySummary.class);
                      // TODO : Fill in the addBandwidthStatYearlySummary381 here
                  

                  //There is no output to be tested!
                  stub.addBandwidthStatYearlySummary(
                  addBandwidthStatYearlySummary381);

              
          }
      
        /**
         * Auto generated test method
         */
        public  void testgetMinimumPeriodId() throws java.lang.Exception{

        org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub =
                    new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.bam.GetMinimumPeriodId getMinimumPeriodId382=
                                                        (org.wso2.carbon.bam.GetMinimumPeriodId)getTestObject(org.wso2.carbon.bam.GetMinimumPeriodId.class);
                    // TODO : Fill in the getMinimumPeriodId382 here
                
                        assertNotNull(stub.getMinimumPeriodId(
                        getMinimumPeriodId382));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetMinimumPeriodId() throws java.lang.Exception{
            org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub = new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();
             org.wso2.carbon.bam.GetMinimumPeriodId getMinimumPeriodId382=
                                                        (org.wso2.carbon.bam.GetMinimumPeriodId)getTestObject(org.wso2.carbon.bam.GetMinimumPeriodId.class);
                    // TODO : Fill in the getMinimumPeriodId382 here
                

                stub.startgetMinimumPeriodId(
                         getMinimumPeriodId382,
                    new tempCallbackN10190()
                );
              


        }

        private class tempCallbackN10190  extends org.wso2.ws.dataservice.MeteringSummaryGenerationDSCallbackHandler{
            public tempCallbackN10190(){ super(null);}

            public void receiveResultgetMinimumPeriodId(
                         org.wso2.carbon.bam.SummaryTimesE result
                            ) {
                
            }

            public void receiveErrorgetMinimumPeriodId(java.lang.Exception e) {
                fail();
            }

        }
      
          /**
          * Auto generated test method
          */
          public  void testaddBandwidthStatMonthlySummary() throws java.lang.Exception{

          org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub =
          new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();//the default implementation should point to the right endpoint
          org.wso2.ws.dataservice.AddBandwidthStatMonthlySummary addBandwidthStatMonthlySummary384=
                  (org.wso2.ws.dataservice.AddBandwidthStatMonthlySummary)getTestObject(org.wso2.ws.dataservice.AddBandwidthStatMonthlySummary.class);
                      // TODO : Fill in the addBandwidthStatMonthlySummary384 here
                  

                  //There is no output to be tested!
                  stub.addBandwidthStatMonthlySummary(
                  addBandwidthStatMonthlySummary384);

              
          }
      
          /**
          * Auto generated test method
          */
          public  void testaddRegistryBandwidthUsageDailySummary() throws java.lang.Exception{

          org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub =
          new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();//the default implementation should point to the right endpoint
          org.wso2.ws.dataservice.AddRegistryBandwidthUsageDailySummary addRegistryBandwidthUsageDailySummary385=
                  (org.wso2.ws.dataservice.AddRegistryBandwidthUsageDailySummary)getTestObject(org.wso2.ws.dataservice.AddRegistryBandwidthUsageDailySummary.class);
                      // TODO : Fill in the addRegistryBandwidthUsageDailySummary385 here
                  

                  //There is no output to be tested!
                  stub.addRegistryBandwidthUsageDailySummary(
                  addRegistryBandwidthUsageDailySummary385);

              
          }
      
        /**
         * Auto generated test method
         */
        public  void testgetLatestMonthlyBandwidthSummaryPeriodId() throws java.lang.Exception{

        org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub =
                    new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.bam.GetLatestMonthlyBandwidthSummaryPeriodId getLatestMonthlyBandwidthSummaryPeriodId386=
                                                        (org.wso2.carbon.bam.GetLatestMonthlyBandwidthSummaryPeriodId)getTestObject(org.wso2.carbon.bam.GetLatestMonthlyBandwidthSummaryPeriodId.class);
                    // TODO : Fill in the getLatestMonthlyBandwidthSummaryPeriodId386 here
                
                        assertNotNull(stub.getLatestMonthlyBandwidthSummaryPeriodId(
                        getLatestMonthlyBandwidthSummaryPeriodId386));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetLatestMonthlyBandwidthSummaryPeriodId() throws java.lang.Exception{
            org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub = new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();
             org.wso2.carbon.bam.GetLatestMonthlyBandwidthSummaryPeriodId getLatestMonthlyBandwidthSummaryPeriodId386=
                                                        (org.wso2.carbon.bam.GetLatestMonthlyBandwidthSummaryPeriodId)getTestObject(org.wso2.carbon.bam.GetLatestMonthlyBandwidthSummaryPeriodId.class);
                    // TODO : Fill in the getLatestMonthlyBandwidthSummaryPeriodId386 here
                

                stub.startgetLatestMonthlyBandwidthSummaryPeriodId(
                         getLatestMonthlyBandwidthSummaryPeriodId386,
                    new tempCallbackN1022D()
                );
              


        }

        private class tempCallbackN1022D  extends org.wso2.ws.dataservice.MeteringSummaryGenerationDSCallbackHandler{
            public tempCallbackN1022D(){ super(null);}

            public void receiveResultgetLatestMonthlyBandwidthSummaryPeriodId(
                         org.wso2.carbon.bam.SummaryTimesE result
                            ) {
                
            }

            public void receiveErrorgetLatestMonthlyBandwidthSummaryPeriodId(java.lang.Exception e) {
                fail();
            }

        }
      
          /**
          * Auto generated test method
          */
          public  void testdeleteServerUserData() throws java.lang.Exception{

          org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub =
          new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();//the default implementation should point to the right endpoint
          org.wso2.ws.dataservice.DeleteServerUserData deleteServerUserData388=
                  (org.wso2.ws.dataservice.DeleteServerUserData)getTestObject(org.wso2.ws.dataservice.DeleteServerUserData.class);
                      // TODO : Fill in the deleteServerUserData388 here
                  

                  //There is no output to be tested!
                  stub.deleteServerUserData(
                  deleteServerUserData388);

              
          }
      
          /**
          * Auto generated test method
          */
          public  void testaddRegistryBandwidthUsageMonthlySummary() throws java.lang.Exception{

          org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub =
          new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();//the default implementation should point to the right endpoint
          org.wso2.ws.dataservice.AddRegistryBandwidthUsageMonthlySummary addRegistryBandwidthUsageMonthlySummary389=
                  (org.wso2.ws.dataservice.AddRegistryBandwidthUsageMonthlySummary)getTestObject(org.wso2.ws.dataservice.AddRegistryBandwidthUsageMonthlySummary.class);
                      // TODO : Fill in the addRegistryBandwidthUsageMonthlySummary389 here
                  

                  //There is no output to be tested!
                  stub.addRegistryBandwidthUsageMonthlySummary(
                  addRegistryBandwidthUsageMonthlySummary389);

              
          }
      
          /**
          * Auto generated test method
          */
          public  void testaddBandwidthStatQuarterlySummary() throws java.lang.Exception{

          org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub =
          new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();//the default implementation should point to the right endpoint
          org.wso2.ws.dataservice.AddBandwidthStatQuarterlySummary addBandwidthStatQuarterlySummary390=
                  (org.wso2.ws.dataservice.AddBandwidthStatQuarterlySummary)getTestObject(org.wso2.ws.dataservice.AddBandwidthStatQuarterlySummary.class);
                      // TODO : Fill in the addBandwidthStatQuarterlySummary390 here
                  

                  //There is no output to be tested!
                  stub.addBandwidthStatQuarterlySummary(
                  addBandwidthStatQuarterlySummary390);

              
          }
      
        /**
         * Auto generated test method
         */
        public  void testgetRegistryBandwidthUsageForMonthlySummary() throws java.lang.Exception{

        org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub =
                    new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.bam.GetRegistryBandwidthUsageForMonthlySummary getRegistryBandwidthUsageForMonthlySummary391=
                                                        (org.wso2.carbon.bam.GetRegistryBandwidthUsageForMonthlySummary)getTestObject(org.wso2.carbon.bam.GetRegistryBandwidthUsageForMonthlySummary.class);
                    // TODO : Fill in the getRegistryBandwidthUsageForMonthlySummary391 here
                
                        assertNotNull(stub.getRegistryBandwidthUsageForMonthlySummary(
                        getRegistryBandwidthUsageForMonthlySummary391));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetRegistryBandwidthUsageForMonthlySummary() throws java.lang.Exception{
            org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub = new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();
             org.wso2.carbon.bam.GetRegistryBandwidthUsageForMonthlySummary getRegistryBandwidthUsageForMonthlySummary391=
                                                        (org.wso2.carbon.bam.GetRegistryBandwidthUsageForMonthlySummary)getTestObject(org.wso2.carbon.bam.GetRegistryBandwidthUsageForMonthlySummary.class);
                    // TODO : Fill in the getRegistryBandwidthUsageForMonthlySummary391 here
                

                stub.startgetRegistryBandwidthUsageForMonthlySummary(
                         getRegistryBandwidthUsageForMonthlySummary391,
                    new tempCallbackN102FA()
                );
              


        }

        private class tempCallbackN102FA  extends org.wso2.ws.dataservice.MeteringSummaryGenerationDSCallbackHandler{
            public tempCallbackN102FA(){ super(null);}

            public void receiveResultgetRegistryBandwidthUsageForMonthlySummary(
                         org.wso2.carbon.bam.BandwidthUsageValuesE result
                            ) {
                
            }

            public void receiveErrorgetRegistryBandwidthUsageForMonthlySummary(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetLatestHourlyBandwidthSummaryPeriodId() throws java.lang.Exception{

        org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub =
                    new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.bam.GetLatestHourlyBandwidthSummaryPeriodId getLatestHourlyBandwidthSummaryPeriodId393=
                                                        (org.wso2.carbon.bam.GetLatestHourlyBandwidthSummaryPeriodId)getTestObject(org.wso2.carbon.bam.GetLatestHourlyBandwidthSummaryPeriodId.class);
                    // TODO : Fill in the getLatestHourlyBandwidthSummaryPeriodId393 here
                
                        assertNotNull(stub.getLatestHourlyBandwidthSummaryPeriodId(
                        getLatestHourlyBandwidthSummaryPeriodId393));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetLatestHourlyBandwidthSummaryPeriodId() throws java.lang.Exception{
            org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub = new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();
             org.wso2.carbon.bam.GetLatestHourlyBandwidthSummaryPeriodId getLatestHourlyBandwidthSummaryPeriodId393=
                                                        (org.wso2.carbon.bam.GetLatestHourlyBandwidthSummaryPeriodId)getTestObject(org.wso2.carbon.bam.GetLatestHourlyBandwidthSummaryPeriodId.class);
                    // TODO : Fill in the getLatestHourlyBandwidthSummaryPeriodId393 here
                

                stub.startgetLatestHourlyBandwidthSummaryPeriodId(
                         getLatestHourlyBandwidthSummaryPeriodId393,
                    new tempCallbackN10337()
                );
              


        }

        private class tempCallbackN10337  extends org.wso2.ws.dataservice.MeteringSummaryGenerationDSCallbackHandler{
            public tempCallbackN10337(){ super(null);}

            public void receiveResultgetLatestHourlyBandwidthSummaryPeriodId(
                         org.wso2.carbon.bam.SummaryTimesE result
                            ) {
                
            }

            public void receiveErrorgetLatestHourlyBandwidthSummaryPeriodId(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetDataForHourlySummary() throws java.lang.Exception{

        org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub =
                    new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.bam.GetDataForHourlySummary getDataForHourlySummary395=
                                                        (org.wso2.carbon.bam.GetDataForHourlySummary)getTestObject(org.wso2.carbon.bam.GetDataForHourlySummary.class);
                    // TODO : Fill in the getDataForHourlySummary395 here
                
                        assertNotNull(stub.getDataForHourlySummary(
                        getDataForHourlySummary395));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetDataForHourlySummary() throws java.lang.Exception{
            org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub = new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();
             org.wso2.carbon.bam.GetDataForHourlySummary getDataForHourlySummary395=
                                                        (org.wso2.carbon.bam.GetDataForHourlySummary)getTestObject(org.wso2.carbon.bam.GetDataForHourlySummary.class);
                    // TODO : Fill in the getDataForHourlySummary395 here
                

                stub.startgetDataForHourlySummary(
                         getDataForHourlySummary395,
                    new tempCallbackN10374()
                );
              


        }

        private class tempCallbackN10374  extends org.wso2.ws.dataservice.MeteringSummaryGenerationDSCallbackHandler{
            public tempCallbackN10374(){ super(null);}

            public void receiveResultgetDataForHourlySummary(
                         org.wso2.carbon.bam.BandwidthHourlyStatValuesE result
                            ) {
                
            }

            public void receiveErrorgetDataForHourlySummary(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetLatestMonthlyRegistryBandwidthSummaryPeriodId() throws java.lang.Exception{

        org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub =
                    new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.bam.GetLatestMonthlyRegistryBandwidthSummaryPeriodId getLatestMonthlyRegistryBandwidthSummaryPeriodId397=
                                                        (org.wso2.carbon.bam.GetLatestMonthlyRegistryBandwidthSummaryPeriodId)getTestObject(org.wso2.carbon.bam.GetLatestMonthlyRegistryBandwidthSummaryPeriodId.class);
                    // TODO : Fill in the getLatestMonthlyRegistryBandwidthSummaryPeriodId397 here
                
                        assertNotNull(stub.getLatestMonthlyRegistryBandwidthSummaryPeriodId(
                        getLatestMonthlyRegistryBandwidthSummaryPeriodId397));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetLatestMonthlyRegistryBandwidthSummaryPeriodId() throws java.lang.Exception{
            org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub = new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();
             org.wso2.carbon.bam.GetLatestMonthlyRegistryBandwidthSummaryPeriodId getLatestMonthlyRegistryBandwidthSummaryPeriodId397=
                                                        (org.wso2.carbon.bam.GetLatestMonthlyRegistryBandwidthSummaryPeriodId)getTestObject(org.wso2.carbon.bam.GetLatestMonthlyRegistryBandwidthSummaryPeriodId.class);
                    // TODO : Fill in the getLatestMonthlyRegistryBandwidthSummaryPeriodId397 here
                

                stub.startgetLatestMonthlyRegistryBandwidthSummaryPeriodId(
                         getLatestMonthlyRegistryBandwidthSummaryPeriodId397,
                    new tempCallbackN103B1()
                );
              


        }

        private class tempCallbackN103B1  extends org.wso2.ws.dataservice.MeteringSummaryGenerationDSCallbackHandler{
            public tempCallbackN103B1(){ super(null);}

            public void receiveResultgetLatestMonthlyRegistryBandwidthSummaryPeriodId(
                         org.wso2.carbon.bam.SummaryTimesE result
                            ) {
                
            }

            public void receiveErrorgetLatestMonthlyRegistryBandwidthSummaryPeriodId(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetDataForQuarterlySummary() throws java.lang.Exception{

        org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub =
                    new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.bam.GetDataForQuarterlySummary getDataForQuarterlySummary399=
                                                        (org.wso2.carbon.bam.GetDataForQuarterlySummary)getTestObject(org.wso2.carbon.bam.GetDataForQuarterlySummary.class);
                    // TODO : Fill in the getDataForQuarterlySummary399 here
                
                        assertNotNull(stub.getDataForQuarterlySummary(
                        getDataForQuarterlySummary399));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetDataForQuarterlySummary() throws java.lang.Exception{
            org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub = new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();
             org.wso2.carbon.bam.GetDataForQuarterlySummary getDataForQuarterlySummary399=
                                                        (org.wso2.carbon.bam.GetDataForQuarterlySummary)getTestObject(org.wso2.carbon.bam.GetDataForQuarterlySummary.class);
                    // TODO : Fill in the getDataForQuarterlySummary399 here
                

                stub.startgetDataForQuarterlySummary(
                         getDataForQuarterlySummary399,
                    new tempCallbackN103EE()
                );
              


        }

        private class tempCallbackN103EE  extends org.wso2.ws.dataservice.MeteringSummaryGenerationDSCallbackHandler{
            public tempCallbackN103EE(){ super(null);}

            public void receiveResultgetDataForQuarterlySummary(
                         org.wso2.carbon.bam.BandwidthStatValuesE result
                            ) {
                
            }

            public void receiveErrorgetDataForQuarterlySummary(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetLatestDailyRegistryBandwidthSummaryPeriodId() throws java.lang.Exception{

        org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub =
                    new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.bam.GetLatestDailyRegistryBandwidthSummaryPeriodId getLatestDailyRegistryBandwidthSummaryPeriodId401=
                                                        (org.wso2.carbon.bam.GetLatestDailyRegistryBandwidthSummaryPeriodId)getTestObject(org.wso2.carbon.bam.GetLatestDailyRegistryBandwidthSummaryPeriodId.class);
                    // TODO : Fill in the getLatestDailyRegistryBandwidthSummaryPeriodId401 here
                
                        assertNotNull(stub.getLatestDailyRegistryBandwidthSummaryPeriodId(
                        getLatestDailyRegistryBandwidthSummaryPeriodId401));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetLatestDailyRegistryBandwidthSummaryPeriodId() throws java.lang.Exception{
            org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub = new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();
             org.wso2.carbon.bam.GetLatestDailyRegistryBandwidthSummaryPeriodId getLatestDailyRegistryBandwidthSummaryPeriodId401=
                                                        (org.wso2.carbon.bam.GetLatestDailyRegistryBandwidthSummaryPeriodId)getTestObject(org.wso2.carbon.bam.GetLatestDailyRegistryBandwidthSummaryPeriodId.class);
                    // TODO : Fill in the getLatestDailyRegistryBandwidthSummaryPeriodId401 here
                

                stub.startgetLatestDailyRegistryBandwidthSummaryPeriodId(
                         getLatestDailyRegistryBandwidthSummaryPeriodId401,
                    new tempCallbackN1042B()
                );
              


        }

        private class tempCallbackN1042B  extends org.wso2.ws.dataservice.MeteringSummaryGenerationDSCallbackHandler{
            public tempCallbackN1042B(){ super(null);}

            public void receiveResultgetLatestDailyRegistryBandwidthSummaryPeriodId(
                         org.wso2.carbon.bam.SummaryTimesE result
                            ) {
                
            }

            public void receiveErrorgetLatestDailyRegistryBandwidthSummaryPeriodId(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetDataForDailySummary() throws java.lang.Exception{

        org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub =
                    new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.bam.GetDataForDailySummary getDataForDailySummary403=
                                                        (org.wso2.carbon.bam.GetDataForDailySummary)getTestObject(org.wso2.carbon.bam.GetDataForDailySummary.class);
                    // TODO : Fill in the getDataForDailySummary403 here
                
                        assertNotNull(stub.getDataForDailySummary(
                        getDataForDailySummary403));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetDataForDailySummary() throws java.lang.Exception{
            org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub = new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();
             org.wso2.carbon.bam.GetDataForDailySummary getDataForDailySummary403=
                                                        (org.wso2.carbon.bam.GetDataForDailySummary)getTestObject(org.wso2.carbon.bam.GetDataForDailySummary.class);
                    // TODO : Fill in the getDataForDailySummary403 here
                

                stub.startgetDataForDailySummary(
                         getDataForDailySummary403,
                    new tempCallbackN10468()
                );
              


        }

        private class tempCallbackN10468  extends org.wso2.ws.dataservice.MeteringSummaryGenerationDSCallbackHandler{
            public tempCallbackN10468(){ super(null);}

            public void receiveResultgetDataForDailySummary(
                         org.wso2.carbon.bam.BandwidthStatValuesE result
                            ) {
                
            }

            public void receiveErrorgetDataForDailySummary(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetLatestYearlyBandwidthSummaryPeriodId() throws java.lang.Exception{

        org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub =
                    new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.bam.GetLatestYearlyBandwidthSummaryPeriodId getLatestYearlyBandwidthSummaryPeriodId405=
                                                        (org.wso2.carbon.bam.GetLatestYearlyBandwidthSummaryPeriodId)getTestObject(org.wso2.carbon.bam.GetLatestYearlyBandwidthSummaryPeriodId.class);
                    // TODO : Fill in the getLatestYearlyBandwidthSummaryPeriodId405 here
                
                        assertNotNull(stub.getLatestYearlyBandwidthSummaryPeriodId(
                        getLatestYearlyBandwidthSummaryPeriodId405));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetLatestYearlyBandwidthSummaryPeriodId() throws java.lang.Exception{
            org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub = new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();
             org.wso2.carbon.bam.GetLatestYearlyBandwidthSummaryPeriodId getLatestYearlyBandwidthSummaryPeriodId405=
                                                        (org.wso2.carbon.bam.GetLatestYearlyBandwidthSummaryPeriodId)getTestObject(org.wso2.carbon.bam.GetLatestYearlyBandwidthSummaryPeriodId.class);
                    // TODO : Fill in the getLatestYearlyBandwidthSummaryPeriodId405 here
                

                stub.startgetLatestYearlyBandwidthSummaryPeriodId(
                         getLatestYearlyBandwidthSummaryPeriodId405,
                    new tempCallbackN104A5()
                );
              


        }

        private class tempCallbackN104A5  extends org.wso2.ws.dataservice.MeteringSummaryGenerationDSCallbackHandler{
            public tempCallbackN104A5(){ super(null);}

            public void receiveResultgetLatestYearlyBandwidthSummaryPeriodId(
                         org.wso2.carbon.bam.SummaryTimesE result
                            ) {
                
            }

            public void receiveErrorgetLatestYearlyBandwidthSummaryPeriodId(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetLatestQuarterlyBandwidthSummaryPeriodId() throws java.lang.Exception{

        org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub =
                    new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.bam.GetLatestQuarterlyBandwidthSummaryPeriodId getLatestQuarterlyBandwidthSummaryPeriodId407=
                                                        (org.wso2.carbon.bam.GetLatestQuarterlyBandwidthSummaryPeriodId)getTestObject(org.wso2.carbon.bam.GetLatestQuarterlyBandwidthSummaryPeriodId.class);
                    // TODO : Fill in the getLatestQuarterlyBandwidthSummaryPeriodId407 here
                
                        assertNotNull(stub.getLatestQuarterlyBandwidthSummaryPeriodId(
                        getLatestQuarterlyBandwidthSummaryPeriodId407));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetLatestQuarterlyBandwidthSummaryPeriodId() throws java.lang.Exception{
            org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub = new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();
             org.wso2.carbon.bam.GetLatestQuarterlyBandwidthSummaryPeriodId getLatestQuarterlyBandwidthSummaryPeriodId407=
                                                        (org.wso2.carbon.bam.GetLatestQuarterlyBandwidthSummaryPeriodId)getTestObject(org.wso2.carbon.bam.GetLatestQuarterlyBandwidthSummaryPeriodId.class);
                    // TODO : Fill in the getLatestQuarterlyBandwidthSummaryPeriodId407 here
                

                stub.startgetLatestQuarterlyBandwidthSummaryPeriodId(
                         getLatestQuarterlyBandwidthSummaryPeriodId407,
                    new tempCallbackN104E2()
                );
              


        }

        private class tempCallbackN104E2  extends org.wso2.ws.dataservice.MeteringSummaryGenerationDSCallbackHandler{
            public tempCallbackN104E2(){ super(null);}

            public void receiveResultgetLatestQuarterlyBandwidthSummaryPeriodId(
                         org.wso2.carbon.bam.SummaryTimesE result
                            ) {
                
            }

            public void receiveErrorgetLatestQuarterlyBandwidthSummaryPeriodId(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetLatestDailyBandwidthSummaryPeriodId() throws java.lang.Exception{

        org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub =
                    new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.bam.GetLatestDailyBandwidthSummaryPeriodId getLatestDailyBandwidthSummaryPeriodId409=
                                                        (org.wso2.carbon.bam.GetLatestDailyBandwidthSummaryPeriodId)getTestObject(org.wso2.carbon.bam.GetLatestDailyBandwidthSummaryPeriodId.class);
                    // TODO : Fill in the getLatestDailyBandwidthSummaryPeriodId409 here
                
                        assertNotNull(stub.getLatestDailyBandwidthSummaryPeriodId(
                        getLatestDailyBandwidthSummaryPeriodId409));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetLatestDailyBandwidthSummaryPeriodId() throws java.lang.Exception{
            org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub stub = new org.wso2.ws.dataservice.MeteringSummaryGenerationDSStub();
             org.wso2.carbon.bam.GetLatestDailyBandwidthSummaryPeriodId getLatestDailyBandwidthSummaryPeriodId409=
                                                        (org.wso2.carbon.bam.GetLatestDailyBandwidthSummaryPeriodId)getTestObject(org.wso2.carbon.bam.GetLatestDailyBandwidthSummaryPeriodId.class);
                    // TODO : Fill in the getLatestDailyBandwidthSummaryPeriodId409 here
                

                stub.startgetLatestDailyBandwidthSummaryPeriodId(
                         getLatestDailyBandwidthSummaryPeriodId409,
                    new tempCallbackN1051F()
                );
              


        }

        private class tempCallbackN1051F  extends org.wso2.ws.dataservice.MeteringSummaryGenerationDSCallbackHandler{
            public tempCallbackN1051F(){ super(null);}

            public void receiveResultgetLatestDailyBandwidthSummaryPeriodId(
                         org.wso2.carbon.bam.SummaryTimesE result
                            ) {
                
            }

            public void receiveErrorgetLatestDailyBandwidthSummaryPeriodId(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    
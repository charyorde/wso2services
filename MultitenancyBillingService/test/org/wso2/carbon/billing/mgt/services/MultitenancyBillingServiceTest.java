

/**
 * MultitenancyBillingServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.billing.mgt.services;

    /*
     *  MultitenancyBillingServiceTest Junit test case
    */

    public class MultitenancyBillingServiceTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testgetOutstandingBalance() throws java.lang.Exception{

        org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceStub stub =
                    new org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.billing.mgt.services.GetOutstandingBalance getOutstandingBalance108=
                                                        (org.wso2.carbon.billing.mgt.services.GetOutstandingBalance)getTestObject(org.wso2.carbon.billing.mgt.services.GetOutstandingBalance.class);
                    // TODO : Fill in the getOutstandingBalance108 here
                
                        assertNotNull(stub.getOutstandingBalance(
                        getOutstandingBalance108));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetOutstandingBalance() throws java.lang.Exception{
            org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceStub stub = new org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceStub();
             org.wso2.carbon.billing.mgt.services.GetOutstandingBalance getOutstandingBalance108=
                                                        (org.wso2.carbon.billing.mgt.services.GetOutstandingBalance)getTestObject(org.wso2.carbon.billing.mgt.services.GetOutstandingBalance.class);
                    // TODO : Fill in the getOutstandingBalance108 here
                

                stub.startgetOutstandingBalance(
                         getOutstandingBalance108,
                    new tempCallbackN1000C()
                );
              


        }

        private class tempCallbackN1000C  extends org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceCallbackHandler{
            public tempCallbackN1000C(){ super(null);}

            public void receiveResultgetOutstandingBalance(
                         org.wso2.carbon.billing.mgt.services.GetOutstandingBalanceResponse result
                            ) {
                
            }

            public void receiveErrorgetOutstandingBalance(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetCurrentInvoice() throws java.lang.Exception{

        org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceStub stub =
                    new org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.billing.mgt.services.GetCurrentInvoice getCurrentInvoice110=
                                                        (org.wso2.carbon.billing.mgt.services.GetCurrentInvoice)getTestObject(org.wso2.carbon.billing.mgt.services.GetCurrentInvoice.class);
                    // TODO : Fill in the getCurrentInvoice110 here
                
                        assertNotNull(stub.getCurrentInvoice(
                        getCurrentInvoice110));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetCurrentInvoice() throws java.lang.Exception{
            org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceStub stub = new org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceStub();
             org.wso2.carbon.billing.mgt.services.GetCurrentInvoice getCurrentInvoice110=
                                                        (org.wso2.carbon.billing.mgt.services.GetCurrentInvoice)getTestObject(org.wso2.carbon.billing.mgt.services.GetCurrentInvoice.class);
                    // TODO : Fill in the getCurrentInvoice110 here
                

                stub.startgetCurrentInvoice(
                         getCurrentInvoice110,
                    new tempCallbackN10049()
                );
              


        }

        private class tempCallbackN10049  extends org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceCallbackHandler{
            public tempCallbackN10049(){ super(null);}

            public void receiveResultgetCurrentInvoice(
                         org.wso2.carbon.billing.mgt.services.GetCurrentInvoiceResponse result
                            ) {
                
            }

            public void receiveErrorgetCurrentInvoice(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetPastInvoice() throws java.lang.Exception{

        org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceStub stub =
                    new org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.billing.mgt.services.GetPastInvoice getPastInvoice112=
                                                        (org.wso2.carbon.billing.mgt.services.GetPastInvoice)getTestObject(org.wso2.carbon.billing.mgt.services.GetPastInvoice.class);
                    // TODO : Fill in the getPastInvoice112 here
                
                        assertNotNull(stub.getPastInvoice(
                        getPastInvoice112));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetPastInvoice() throws java.lang.Exception{
            org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceStub stub = new org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceStub();
             org.wso2.carbon.billing.mgt.services.GetPastInvoice getPastInvoice112=
                                                        (org.wso2.carbon.billing.mgt.services.GetPastInvoice)getTestObject(org.wso2.carbon.billing.mgt.services.GetPastInvoice.class);
                    // TODO : Fill in the getPastInvoice112 here
                

                stub.startgetPastInvoice(
                         getPastInvoice112,
                    new tempCallbackN10086()
                );
              


        }

        private class tempCallbackN10086  extends org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceCallbackHandler{
            public tempCallbackN10086(){ super(null);}

            public void receiveResultgetPastInvoice(
                         org.wso2.carbon.billing.mgt.services.GetPastInvoiceResponse result
                            ) {
                
            }

            public void receiveErrorgetPastInvoice(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testaddPayment() throws java.lang.Exception{

        org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceStub stub =
                    new org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.billing.mgt.services.AddPayment addPayment114=
                                                        (org.wso2.carbon.billing.mgt.services.AddPayment)getTestObject(org.wso2.carbon.billing.mgt.services.AddPayment.class);
                    // TODO : Fill in the addPayment114 here
                
                        assertNotNull(stub.addPayment(
                        addPayment114));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartaddPayment() throws java.lang.Exception{
            org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceStub stub = new org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceStub();
             org.wso2.carbon.billing.mgt.services.AddPayment addPayment114=
                                                        (org.wso2.carbon.billing.mgt.services.AddPayment)getTestObject(org.wso2.carbon.billing.mgt.services.AddPayment.class);
                    // TODO : Fill in the addPayment114 here
                

                stub.startaddPayment(
                         addPayment114,
                    new tempCallbackN100C3()
                );
              


        }

        private class tempCallbackN100C3  extends org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceCallbackHandler{
            public tempCallbackN100C3(){ super(null);}

            public void receiveResultaddPayment(
                         org.wso2.carbon.billing.mgt.services.AddPaymentResponse result
                            ) {
                
            }

            public void receiveErroraddPayment(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetAvailableBillingPeriods() throws java.lang.Exception{

        org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceStub stub =
                    new org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.billing.mgt.services.GetAvailableBillingPeriods getAvailableBillingPeriods116=
                                                        (org.wso2.carbon.billing.mgt.services.GetAvailableBillingPeriods)getTestObject(org.wso2.carbon.billing.mgt.services.GetAvailableBillingPeriods.class);
                    // TODO : Fill in the getAvailableBillingPeriods116 here
                
                        assertNotNull(stub.getAvailableBillingPeriods(
                        getAvailableBillingPeriods116));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetAvailableBillingPeriods() throws java.lang.Exception{
            org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceStub stub = new org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceStub();
             org.wso2.carbon.billing.mgt.services.GetAvailableBillingPeriods getAvailableBillingPeriods116=
                                                        (org.wso2.carbon.billing.mgt.services.GetAvailableBillingPeriods)getTestObject(org.wso2.carbon.billing.mgt.services.GetAvailableBillingPeriods.class);
                    // TODO : Fill in the getAvailableBillingPeriods116 here
                

                stub.startgetAvailableBillingPeriods(
                         getAvailableBillingPeriods116,
                    new tempCallbackN10100()
                );
              


        }

        private class tempCallbackN10100  extends org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceCallbackHandler{
            public tempCallbackN10100(){ super(null);}

            public void receiveResultgetAvailableBillingPeriods(
                         org.wso2.carbon.billing.mgt.services.GetAvailableBillingPeriodsResponse result
                            ) {
                
            }

            public void receiveErrorgetAvailableBillingPeriods(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetPaginatedBalances() throws java.lang.Exception{

        org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceStub stub =
                    new org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.billing.mgt.services.GetPaginatedBalances getPaginatedBalances118=
                                                        (org.wso2.carbon.billing.mgt.services.GetPaginatedBalances)getTestObject(org.wso2.carbon.billing.mgt.services.GetPaginatedBalances.class);
                    // TODO : Fill in the getPaginatedBalances118 here
                
                        assertNotNull(stub.getPaginatedBalances(
                        getPaginatedBalances118));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetPaginatedBalances() throws java.lang.Exception{
            org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceStub stub = new org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceStub();
             org.wso2.carbon.billing.mgt.services.GetPaginatedBalances getPaginatedBalances118=
                                                        (org.wso2.carbon.billing.mgt.services.GetPaginatedBalances)getTestObject(org.wso2.carbon.billing.mgt.services.GetPaginatedBalances.class);
                    // TODO : Fill in the getPaginatedBalances118 here
                

                stub.startgetPaginatedBalances(
                         getPaginatedBalances118,
                    new tempCallbackN1013D()
                );
              


        }

        private class tempCallbackN1013D  extends org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceCallbackHandler{
            public tempCallbackN1013D(){ super(null);}

            public void receiveResultgetPaginatedBalances(
                         org.wso2.carbon.billing.mgt.services.GetPaginatedBalancesResponse result
                            ) {
                
            }

            public void receiveErrorgetPaginatedBalances(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    
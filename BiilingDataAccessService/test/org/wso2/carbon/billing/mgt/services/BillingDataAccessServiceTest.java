

/**
 * BillingDataAccessServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.billing.mgt.services;

    /*
     *  BillingDataAccessServiceTest Junit test case
    */

    public class BillingDataAccessServiceTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testgetItemIdWithName() throws java.lang.Exception{

        org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub stub =
                    new org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.billing.mgt.services.GetItemIdWithName getItemIdWithName162=
                                                        (org.wso2.carbon.billing.mgt.services.GetItemIdWithName)getTestObject(org.wso2.carbon.billing.mgt.services.GetItemIdWithName.class);
                    // TODO : Fill in the getItemIdWithName162 here
                
                        assertNotNull(stub.getItemIdWithName(
                        getItemIdWithName162));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetItemIdWithName() throws java.lang.Exception{
            org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub stub = new org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub();
             org.wso2.carbon.billing.mgt.services.GetItemIdWithName getItemIdWithName162=
                                                        (org.wso2.carbon.billing.mgt.services.GetItemIdWithName)getTestObject(org.wso2.carbon.billing.mgt.services.GetItemIdWithName.class);
                    // TODO : Fill in the getItemIdWithName162 here
                

                stub.startgetItemIdWithName(
                         getItemIdWithName162,
                    new tempCallbackN1000C()
                );
              


        }

        private class tempCallbackN1000C  extends org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceCallbackHandler{
            public tempCallbackN1000C(){ super(null);}

            public void receiveResultgetItemIdWithName(
                         org.wso2.carbon.billing.mgt.services.GetItemIdWithNameResponse result
                            ) {
                
            }

            public void receiveErrorgetItemIdWithName(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testaddSubscription() throws java.lang.Exception{

        org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub stub =
                    new org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.billing.mgt.services.AddSubscription addSubscription164=
                                                        (org.wso2.carbon.billing.mgt.services.AddSubscription)getTestObject(org.wso2.carbon.billing.mgt.services.AddSubscription.class);
                    // TODO : Fill in the addSubscription164 here
                
                        assertNotNull(stub.addSubscription(
                        addSubscription164));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartaddSubscription() throws java.lang.Exception{
            org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub stub = new org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub();
             org.wso2.carbon.billing.mgt.services.AddSubscription addSubscription164=
                                                        (org.wso2.carbon.billing.mgt.services.AddSubscription)getTestObject(org.wso2.carbon.billing.mgt.services.AddSubscription.class);
                    // TODO : Fill in the addSubscription164 here
                

                stub.startaddSubscription(
                         addSubscription164,
                    new tempCallbackN10049()
                );
              


        }

        private class tempCallbackN10049  extends org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceCallbackHandler{
            public tempCallbackN10049(){ super(null);}

            public void receiveResultaddSubscription(
                         org.wso2.carbon.billing.mgt.services.AddSubscriptionResponse result
                            ) {
                
            }

            public void receiveErroraddSubscription(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetCustomerWithName() throws java.lang.Exception{

        org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub stub =
                    new org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.billing.mgt.services.GetCustomerWithName getCustomerWithName166=
                                                        (org.wso2.carbon.billing.mgt.services.GetCustomerWithName)getTestObject(org.wso2.carbon.billing.mgt.services.GetCustomerWithName.class);
                    // TODO : Fill in the getCustomerWithName166 here
                
                        assertNotNull(stub.getCustomerWithName(
                        getCustomerWithName166));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetCustomerWithName() throws java.lang.Exception{
            org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub stub = new org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub();
             org.wso2.carbon.billing.mgt.services.GetCustomerWithName getCustomerWithName166=
                                                        (org.wso2.carbon.billing.mgt.services.GetCustomerWithName)getTestObject(org.wso2.carbon.billing.mgt.services.GetCustomerWithName.class);
                    // TODO : Fill in the getCustomerWithName166 here
                

                stub.startgetCustomerWithName(
                         getCustomerWithName166,
                    new tempCallbackN10086()
                );
              


        }

        private class tempCallbackN10086  extends org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceCallbackHandler{
            public tempCallbackN10086(){ super(null);}

            public void receiveResultgetCustomerWithName(
                         org.wso2.carbon.billing.mgt.services.GetCustomerWithNameResponse result
                            ) {
                
            }

            public void receiveErrorgetCustomerWithName(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetInactiveSubscriptionsOfCustomer() throws java.lang.Exception{

        org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub stub =
                    new org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.billing.mgt.services.GetInactiveSubscriptionsOfCustomer getInactiveSubscriptionsOfCustomer168=
                                                        (org.wso2.carbon.billing.mgt.services.GetInactiveSubscriptionsOfCustomer)getTestObject(org.wso2.carbon.billing.mgt.services.GetInactiveSubscriptionsOfCustomer.class);
                    // TODO : Fill in the getInactiveSubscriptionsOfCustomer168 here
                
                        assertNotNull(stub.getInactiveSubscriptionsOfCustomer(
                        getInactiveSubscriptionsOfCustomer168));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetInactiveSubscriptionsOfCustomer() throws java.lang.Exception{
            org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub stub = new org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub();
             org.wso2.carbon.billing.mgt.services.GetInactiveSubscriptionsOfCustomer getInactiveSubscriptionsOfCustomer168=
                                                        (org.wso2.carbon.billing.mgt.services.GetInactiveSubscriptionsOfCustomer)getTestObject(org.wso2.carbon.billing.mgt.services.GetInactiveSubscriptionsOfCustomer.class);
                    // TODO : Fill in the getInactiveSubscriptionsOfCustomer168 here
                

                stub.startgetInactiveSubscriptionsOfCustomer(
                         getInactiveSubscriptionsOfCustomer168,
                    new tempCallbackN100C3()
                );
              


        }

        private class tempCallbackN100C3  extends org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceCallbackHandler{
            public tempCallbackN100C3(){ super(null);}

            public void receiveResultgetInactiveSubscriptionsOfCustomer(
                         org.wso2.carbon.billing.mgt.services.GetInactiveSubscriptionsOfCustomerResponse result
                            ) {
                
            }

            public void receiveErrorgetInactiveSubscriptionsOfCustomer(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testdeactivateActiveSubscription() throws java.lang.Exception{

        org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub stub =
                    new org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.billing.mgt.services.DeactivateActiveSubscription deactivateActiveSubscription170=
                                                        (org.wso2.carbon.billing.mgt.services.DeactivateActiveSubscription)getTestObject(org.wso2.carbon.billing.mgt.services.DeactivateActiveSubscription.class);
                    // TODO : Fill in the deactivateActiveSubscription170 here
                
                        assertNotNull(stub.deactivateActiveSubscription(
                        deactivateActiveSubscription170));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartdeactivateActiveSubscription() throws java.lang.Exception{
            org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub stub = new org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub();
             org.wso2.carbon.billing.mgt.services.DeactivateActiveSubscription deactivateActiveSubscription170=
                                                        (org.wso2.carbon.billing.mgt.services.DeactivateActiveSubscription)getTestObject(org.wso2.carbon.billing.mgt.services.DeactivateActiveSubscription.class);
                    // TODO : Fill in the deactivateActiveSubscription170 here
                

                stub.startdeactivateActiveSubscription(
                         deactivateActiveSubscription170,
                    new tempCallbackN10100()
                );
              


        }

        private class tempCallbackN10100  extends org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceCallbackHandler{
            public tempCallbackN10100(){ super(null);}

            public void receiveResultdeactivateActiveSubscription(
                         org.wso2.carbon.billing.mgt.services.DeactivateActiveSubscriptionResponse result
                            ) {
                
            }

            public void receiveErrordeactivateActiveSubscription(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testchangeSubscription() throws java.lang.Exception{

        org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub stub =
                    new org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.billing.mgt.services.ChangeSubscription changeSubscription172=
                                                        (org.wso2.carbon.billing.mgt.services.ChangeSubscription)getTestObject(org.wso2.carbon.billing.mgt.services.ChangeSubscription.class);
                    // TODO : Fill in the changeSubscription172 here
                
                        assertNotNull(stub.changeSubscription(
                        changeSubscription172));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartchangeSubscription() throws java.lang.Exception{
            org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub stub = new org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub();
             org.wso2.carbon.billing.mgt.services.ChangeSubscription changeSubscription172=
                                                        (org.wso2.carbon.billing.mgt.services.ChangeSubscription)getTestObject(org.wso2.carbon.billing.mgt.services.ChangeSubscription.class);
                    // TODO : Fill in the changeSubscription172 here
                

                stub.startchangeSubscription(
                         changeSubscription172,
                    new tempCallbackN1013D()
                );
              


        }

        private class tempCallbackN1013D  extends org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceCallbackHandler{
            public tempCallbackN1013D(){ super(null);}

            public void receiveResultchangeSubscription(
                         org.wso2.carbon.billing.mgt.services.ChangeSubscriptionResponse result
                            ) {
                
            }

            public void receiveErrorchangeSubscription(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetActiveSubscriptionOfCustomer() throws java.lang.Exception{

        org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub stub =
                    new org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.billing.mgt.services.GetActiveSubscriptionOfCustomer getActiveSubscriptionOfCustomer174=
                                                        (org.wso2.carbon.billing.mgt.services.GetActiveSubscriptionOfCustomer)getTestObject(org.wso2.carbon.billing.mgt.services.GetActiveSubscriptionOfCustomer.class);
                    // TODO : Fill in the getActiveSubscriptionOfCustomer174 here
                
                        assertNotNull(stub.getActiveSubscriptionOfCustomer(
                        getActiveSubscriptionOfCustomer174));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetActiveSubscriptionOfCustomer() throws java.lang.Exception{
            org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub stub = new org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub();
             org.wso2.carbon.billing.mgt.services.GetActiveSubscriptionOfCustomer getActiveSubscriptionOfCustomer174=
                                                        (org.wso2.carbon.billing.mgt.services.GetActiveSubscriptionOfCustomer)getTestObject(org.wso2.carbon.billing.mgt.services.GetActiveSubscriptionOfCustomer.class);
                    // TODO : Fill in the getActiveSubscriptionOfCustomer174 here
                

                stub.startgetActiveSubscriptionOfCustomer(
                         getActiveSubscriptionOfCustomer174,
                    new tempCallbackN1017A()
                );
              


        }

        private class tempCallbackN1017A  extends org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceCallbackHandler{
            public tempCallbackN1017A(){ super(null);}

            public void receiveResultgetActiveSubscriptionOfCustomer(
                         org.wso2.carbon.billing.mgt.services.GetActiveSubscriptionOfCustomerResponse result
                            ) {
                
            }

            public void receiveErrorgetActiveSubscriptionOfCustomer(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetSubscription() throws java.lang.Exception{

        org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub stub =
                    new org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.billing.mgt.services.GetSubscription getSubscription176=
                                                        (org.wso2.carbon.billing.mgt.services.GetSubscription)getTestObject(org.wso2.carbon.billing.mgt.services.GetSubscription.class);
                    // TODO : Fill in the getSubscription176 here
                
                        assertNotNull(stub.getSubscription(
                        getSubscription176));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetSubscription() throws java.lang.Exception{
            org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub stub = new org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub();
             org.wso2.carbon.billing.mgt.services.GetSubscription getSubscription176=
                                                        (org.wso2.carbon.billing.mgt.services.GetSubscription)getTestObject(org.wso2.carbon.billing.mgt.services.GetSubscription.class);
                    // TODO : Fill in the getSubscription176 here
                

                stub.startgetSubscription(
                         getSubscription176,
                    new tempCallbackN101B7()
                );
              


        }

        private class tempCallbackN101B7  extends org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceCallbackHandler{
            public tempCallbackN101B7(){ super(null);}

            public void receiveResultgetSubscription(
                         org.wso2.carbon.billing.mgt.services.GetSubscriptionResponse result
                            ) {
                
            }

            public void receiveErrorgetSubscription(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testactivateSubscription() throws java.lang.Exception{

        org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub stub =
                    new org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.billing.mgt.services.ActivateSubscription activateSubscription178=
                                                        (org.wso2.carbon.billing.mgt.services.ActivateSubscription)getTestObject(org.wso2.carbon.billing.mgt.services.ActivateSubscription.class);
                    // TODO : Fill in the activateSubscription178 here
                
                        assertNotNull(stub.activateSubscription(
                        activateSubscription178));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartactivateSubscription() throws java.lang.Exception{
            org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub stub = new org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceStub();
             org.wso2.carbon.billing.mgt.services.ActivateSubscription activateSubscription178=
                                                        (org.wso2.carbon.billing.mgt.services.ActivateSubscription)getTestObject(org.wso2.carbon.billing.mgt.services.ActivateSubscription.class);
                    // TODO : Fill in the activateSubscription178 here
                

                stub.startactivateSubscription(
                         activateSubscription178,
                    new tempCallbackN101F4()
                );
              


        }

        private class tempCallbackN101F4  extends org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceCallbackHandler{
            public tempCallbackN101F4(){ super(null);}

            public void receiveResultactivateSubscription(
                         org.wso2.carbon.billing.mgt.services.ActivateSubscriptionResponse result
                            ) {
                
            }

            public void receiveErroractivateSubscription(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    
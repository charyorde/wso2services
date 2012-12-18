

/**
 * StratosPaymentTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.payment.paypal.services;

    /*
     *  StratosPaymentTest Junit test case
    */

    public class StratosPaymentTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testdoExpressCheckout() throws java.lang.Exception{

        org.wso2.carbon.payment.paypal.services.StratosPaymentStub stub =
                    new org.wso2.carbon.payment.paypal.services.StratosPaymentStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.payment.paypal.services.DoExpressCheckout doExpressCheckout54=
                                                        (org.wso2.carbon.payment.paypal.services.DoExpressCheckout)getTestObject(org.wso2.carbon.payment.paypal.services.DoExpressCheckout.class);
                    // TODO : Fill in the doExpressCheckout54 here
                
                        assertNotNull(stub.doExpressCheckout(
                        doExpressCheckout54));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartdoExpressCheckout() throws java.lang.Exception{
            org.wso2.carbon.payment.paypal.services.StratosPaymentStub stub = new org.wso2.carbon.payment.paypal.services.StratosPaymentStub();
             org.wso2.carbon.payment.paypal.services.DoExpressCheckout doExpressCheckout54=
                                                        (org.wso2.carbon.payment.paypal.services.DoExpressCheckout)getTestObject(org.wso2.carbon.payment.paypal.services.DoExpressCheckout.class);
                    // TODO : Fill in the doExpressCheckout54 here
                

                stub.startdoExpressCheckout(
                         doExpressCheckout54,
                    new tempCallbackN1000C()
                );
              


        }

        private class tempCallbackN1000C  extends org.wso2.carbon.payment.paypal.services.StratosPaymentCallbackHandler{
            public tempCallbackN1000C(){ super(null);}

            public void receiveResultdoExpressCheckout(
                         org.wso2.carbon.payment.paypal.services.DoExpressCheckoutResponse result
                            ) {
                
            }

            public void receiveErrordoExpressCheckout(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testinitExpressCheckout() throws java.lang.Exception{

        org.wso2.carbon.payment.paypal.services.StratosPaymentStub stub =
                    new org.wso2.carbon.payment.paypal.services.StratosPaymentStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.payment.paypal.services.InitExpressCheckout initExpressCheckout56=
                                                        (org.wso2.carbon.payment.paypal.services.InitExpressCheckout)getTestObject(org.wso2.carbon.payment.paypal.services.InitExpressCheckout.class);
                    // TODO : Fill in the initExpressCheckout56 here
                
                        assertNotNull(stub.initExpressCheckout(
                        initExpressCheckout56));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartinitExpressCheckout() throws java.lang.Exception{
            org.wso2.carbon.payment.paypal.services.StratosPaymentStub stub = new org.wso2.carbon.payment.paypal.services.StratosPaymentStub();
             org.wso2.carbon.payment.paypal.services.InitExpressCheckout initExpressCheckout56=
                                                        (org.wso2.carbon.payment.paypal.services.InitExpressCheckout)getTestObject(org.wso2.carbon.payment.paypal.services.InitExpressCheckout.class);
                    // TODO : Fill in the initExpressCheckout56 here
                

                stub.startinitExpressCheckout(
                         initExpressCheckout56,
                    new tempCallbackN10049()
                );
              


        }

        private class tempCallbackN10049  extends org.wso2.carbon.payment.paypal.services.StratosPaymentCallbackHandler{
            public tempCallbackN10049(){ super(null);}

            public void receiveResultinitExpressCheckout(
                         org.wso2.carbon.payment.paypal.services.InitExpressCheckoutResponse result
                            ) {
                
            }

            public void receiveErrorinitExpressCheckout(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetExpressCheckoutDetails() throws java.lang.Exception{

        org.wso2.carbon.payment.paypal.services.StratosPaymentStub stub =
                    new org.wso2.carbon.payment.paypal.services.StratosPaymentStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.payment.paypal.services.GetExpressCheckoutDetails getExpressCheckoutDetails58=
                                                        (org.wso2.carbon.payment.paypal.services.GetExpressCheckoutDetails)getTestObject(org.wso2.carbon.payment.paypal.services.GetExpressCheckoutDetails.class);
                    // TODO : Fill in the getExpressCheckoutDetails58 here
                
                        assertNotNull(stub.getExpressCheckoutDetails(
                        getExpressCheckoutDetails58));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetExpressCheckoutDetails() throws java.lang.Exception{
            org.wso2.carbon.payment.paypal.services.StratosPaymentStub stub = new org.wso2.carbon.payment.paypal.services.StratosPaymentStub();
             org.wso2.carbon.payment.paypal.services.GetExpressCheckoutDetails getExpressCheckoutDetails58=
                                                        (org.wso2.carbon.payment.paypal.services.GetExpressCheckoutDetails)getTestObject(org.wso2.carbon.payment.paypal.services.GetExpressCheckoutDetails.class);
                    // TODO : Fill in the getExpressCheckoutDetails58 here
                

                stub.startgetExpressCheckoutDetails(
                         getExpressCheckoutDetails58,
                    new tempCallbackN10086()
                );
              


        }

        private class tempCallbackN10086  extends org.wso2.carbon.payment.paypal.services.StratosPaymentCallbackHandler{
            public tempCallbackN10086(){ super(null);}

            public void receiveResultgetExpressCheckoutDetails(
                         org.wso2.carbon.payment.paypal.services.GetExpressCheckoutDetailsResponse result
                            ) {
                
            }

            public void receiveErrorgetExpressCheckoutDetails(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    
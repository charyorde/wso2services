

/**
 * UpgradeServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.upgrade.services;

    /*
     *  UpgradeServiceTest Junit test case
    */

    public class UpgradeServiceTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testgetCurrentSubscription() throws java.lang.Exception{

        org.wso2.carbon.upgrade.services.UpgradeServiceStub stub =
                    new org.wso2.carbon.upgrade.services.UpgradeServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.upgrade.services.GetCurrentSubscription getCurrentSubscription54=
                                                        (org.wso2.carbon.upgrade.services.GetCurrentSubscription)getTestObject(org.wso2.carbon.upgrade.services.GetCurrentSubscription.class);
                    // TODO : Fill in the getCurrentSubscription54 here
                
                        assertNotNull(stub.getCurrentSubscription(
                        getCurrentSubscription54));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetCurrentSubscription() throws java.lang.Exception{
            org.wso2.carbon.upgrade.services.UpgradeServiceStub stub = new org.wso2.carbon.upgrade.services.UpgradeServiceStub();
             org.wso2.carbon.upgrade.services.GetCurrentSubscription getCurrentSubscription54=
                                                        (org.wso2.carbon.upgrade.services.GetCurrentSubscription)getTestObject(org.wso2.carbon.upgrade.services.GetCurrentSubscription.class);
                    // TODO : Fill in the getCurrentSubscription54 here
                

                stub.startgetCurrentSubscription(
                         getCurrentSubscription54,
                    new tempCallbackN1000C()
                );
              


        }

        private class tempCallbackN1000C  extends org.wso2.carbon.upgrade.services.UpgradeServiceCallbackHandler{
            public tempCallbackN1000C(){ super(null);}

            public void receiveResultgetCurrentSubscription(
                         org.wso2.carbon.upgrade.services.GetCurrentSubscriptionResponse result
                            ) {
                
            }

            public void receiveErrorgetCurrentSubscription(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetPackageInfo() throws java.lang.Exception{

        org.wso2.carbon.upgrade.services.UpgradeServiceStub stub =
                    new org.wso2.carbon.upgrade.services.UpgradeServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.upgrade.services.GetPackageInfo getPackageInfo56=
                                                        (org.wso2.carbon.upgrade.services.GetPackageInfo)getTestObject(org.wso2.carbon.upgrade.services.GetPackageInfo.class);
                    // TODO : Fill in the getPackageInfo56 here
                
                        assertNotNull(stub.getPackageInfo(
                        getPackageInfo56));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetPackageInfo() throws java.lang.Exception{
            org.wso2.carbon.upgrade.services.UpgradeServiceStub stub = new org.wso2.carbon.upgrade.services.UpgradeServiceStub();
             org.wso2.carbon.upgrade.services.GetPackageInfo getPackageInfo56=
                                                        (org.wso2.carbon.upgrade.services.GetPackageInfo)getTestObject(org.wso2.carbon.upgrade.services.GetPackageInfo.class);
                    // TODO : Fill in the getPackageInfo56 here
                

                stub.startgetPackageInfo(
                         getPackageInfo56,
                    new tempCallbackN10049()
                );
              


        }

        private class tempCallbackN10049  extends org.wso2.carbon.upgrade.services.UpgradeServiceCallbackHandler{
            public tempCallbackN10049(){ super(null);}

            public void receiveResultgetPackageInfo(
                         org.wso2.carbon.upgrade.services.GetPackageInfoResponse result
                            ) {
                
            }

            public void receiveErrorgetPackageInfo(java.lang.Exception e) {
                fail();
            }

        }
      
          /**
          * Auto generated test method
          */
          public  void testcancelSubscription() throws java.lang.Exception{

          org.wso2.carbon.upgrade.services.UpgradeServiceStub stub =
          new org.wso2.carbon.upgrade.services.UpgradeServiceStub();//the default implementation should point to the right endpoint
          org.wso2.carbon.upgrade.services.CancelSubscription cancelSubscription58=
                  (org.wso2.carbon.upgrade.services.CancelSubscription)getTestObject(org.wso2.carbon.upgrade.services.CancelSubscription.class);
                      // TODO : Fill in the cancelSubscription58 here
                  

                  //There is no output to be tested!
                  stub.cancelSubscription(
                  cancelSubscription58);

              
          }
      
          /**
          * Auto generated test method
          */
          public  void testupdateSubscription() throws java.lang.Exception{

          org.wso2.carbon.upgrade.services.UpgradeServiceStub stub =
          new org.wso2.carbon.upgrade.services.UpgradeServiceStub();//the default implementation should point to the right endpoint
          org.wso2.carbon.upgrade.services.UpdateSubscription updateSubscription59=
                  (org.wso2.carbon.upgrade.services.UpdateSubscription)getTestObject(org.wso2.carbon.upgrade.services.UpdateSubscription.class);
                      // TODO : Fill in the updateSubscription59 here
                  

                  //There is no output to be tested!
                  stub.updateSubscription(
                  updateSubscription59);

              
          }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    
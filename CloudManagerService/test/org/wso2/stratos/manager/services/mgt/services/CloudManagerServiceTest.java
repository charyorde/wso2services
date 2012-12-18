

/**
 * CloudManagerServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.stratos.manager.services.mgt.services;

    /*
     *  CloudManagerServiceTest Junit test case
    */

    public class CloudManagerServiceTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testdeactivate() throws java.lang.Exception{

        org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceStub stub =
                    new org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceStub();//the default implementation should point to the right endpoint

           org.wso2.stratos.manager.services.mgt.services.Deactivate deactivate75=
                                                        (org.wso2.stratos.manager.services.mgt.services.Deactivate)getTestObject(org.wso2.stratos.manager.services.mgt.services.Deactivate.class);
                    // TODO : Fill in the deactivate75 here
                
                    
                    //There is no output to be tested!
                    stub.deactivate(
                        deactivate75);
                    



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartdeactivate() throws java.lang.Exception{
            org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceStub stub = new org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceStub();
             org.wso2.stratos.manager.services.mgt.services.Deactivate deactivate75=
                                                        (org.wso2.stratos.manager.services.mgt.services.Deactivate)getTestObject(org.wso2.stratos.manager.services.mgt.services.Deactivate.class);
                    // TODO : Fill in the deactivate75 here
                

                stub.startdeactivate(
                         deactivate75,
                    new tempCallbackN1000C()
                );
              


        }

        private class tempCallbackN1000C  extends org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceCallbackHandler{
            public tempCallbackN1000C(){ super(null);}

            public void receiveResultdeactivate(
                         ) {
                
            }

            public void receiveErrordeactivate(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testretrieveCloudServiceInfo() throws java.lang.Exception{

        org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceStub stub =
                    new org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceStub();//the default implementation should point to the right endpoint

           org.wso2.stratos.manager.services.mgt.services.RetrieveCloudServiceInfo retrieveCloudServiceInfo77=
                                                        (org.wso2.stratos.manager.services.mgt.services.RetrieveCloudServiceInfo)getTestObject(org.wso2.stratos.manager.services.mgt.services.RetrieveCloudServiceInfo.class);
                    // TODO : Fill in the retrieveCloudServiceInfo77 here
                
                        assertNotNull(stub.retrieveCloudServiceInfo(
                        retrieveCloudServiceInfo77));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartretrieveCloudServiceInfo() throws java.lang.Exception{
            org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceStub stub = new org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceStub();
             org.wso2.stratos.manager.services.mgt.services.RetrieveCloudServiceInfo retrieveCloudServiceInfo77=
                                                        (org.wso2.stratos.manager.services.mgt.services.RetrieveCloudServiceInfo)getTestObject(org.wso2.stratos.manager.services.mgt.services.RetrieveCloudServiceInfo.class);
                    // TODO : Fill in the retrieveCloudServiceInfo77 here
                

                stub.startretrieveCloudServiceInfo(
                         retrieveCloudServiceInfo77,
                    new tempCallbackN10046()
                );
              


        }

        private class tempCallbackN10046  extends org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceCallbackHandler{
            public tempCallbackN10046(){ super(null);}

            public void receiveResultretrieveCloudServiceInfo(
                         org.wso2.stratos.manager.services.mgt.services.RetrieveCloudServiceInfoResponse result
                            ) {
                
            }

            public void receiveErrorretrieveCloudServiceInfo(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testactivate() throws java.lang.Exception{

        org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceStub stub =
                    new org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceStub();//the default implementation should point to the right endpoint

           org.wso2.stratos.manager.services.mgt.services.Activate activate79=
                                                        (org.wso2.stratos.manager.services.mgt.services.Activate)getTestObject(org.wso2.stratos.manager.services.mgt.services.Activate.class);
                    // TODO : Fill in the activate79 here
                
                    
                    //There is no output to be tested!
                    stub.activate(
                        activate79);
                    



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartactivate() throws java.lang.Exception{
            org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceStub stub = new org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceStub();
             org.wso2.stratos.manager.services.mgt.services.Activate activate79=
                                                        (org.wso2.stratos.manager.services.mgt.services.Activate)getTestObject(org.wso2.stratos.manager.services.mgt.services.Activate.class);
                    // TODO : Fill in the activate79 here
                

                stub.startactivate(
                         activate79,
                    new tempCallbackN10083()
                );
              


        }

        private class tempCallbackN10083  extends org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceCallbackHandler{
            public tempCallbackN10083(){ super(null);}

            public void receiveResultactivate(
                         ) {
                
            }

            public void receiveErroractivate(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testsaveCloudServicesActivity() throws java.lang.Exception{

        org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceStub stub =
                    new org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceStub();//the default implementation should point to the right endpoint

           org.wso2.stratos.manager.services.mgt.services.SaveCloudServicesActivity saveCloudServicesActivity81=
                                                        (org.wso2.stratos.manager.services.mgt.services.SaveCloudServicesActivity)getTestObject(org.wso2.stratos.manager.services.mgt.services.SaveCloudServicesActivity.class);
                    // TODO : Fill in the saveCloudServicesActivity81 here
                
                    
                    //There is no output to be tested!
                    stub.saveCloudServicesActivity(
                        saveCloudServicesActivity81);
                    



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartsaveCloudServicesActivity() throws java.lang.Exception{
            org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceStub stub = new org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceStub();
             org.wso2.stratos.manager.services.mgt.services.SaveCloudServicesActivity saveCloudServicesActivity81=
                                                        (org.wso2.stratos.manager.services.mgt.services.SaveCloudServicesActivity)getTestObject(org.wso2.stratos.manager.services.mgt.services.SaveCloudServicesActivity.class);
                    // TODO : Fill in the saveCloudServicesActivity81 here
                

                stub.startsaveCloudServicesActivity(
                         saveCloudServicesActivity81,
                    new tempCallbackN100BD()
                );
              


        }

        private class tempCallbackN100BD  extends org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceCallbackHandler{
            public tempCallbackN100BD(){ super(null);}

            public void receiveResultsaveCloudServicesActivity(
                         ) {
                
            }

            public void receiveErrorsaveCloudServicesActivity(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    
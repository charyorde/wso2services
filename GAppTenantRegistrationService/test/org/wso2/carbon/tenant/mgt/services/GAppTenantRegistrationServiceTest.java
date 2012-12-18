

/**
 * GAppTenantRegistrationServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.tenant.mgt.services;

    /*
     *  GAppTenantRegistrationServiceTest Junit test case
    */

    public class GAppTenantRegistrationServiceTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testregisterGoogleAppsTenant() throws java.lang.Exception{

        org.wso2.carbon.tenant.mgt.services.GAppTenantRegistrationServiceStub stub =
                    new org.wso2.carbon.tenant.mgt.services.GAppTenantRegistrationServiceStub();//the default implementation should point to the right endpoint

           axis2.apache.org.xsd.RegisterGoogleAppsTenant registerGoogleAppsTenant18=
                                                        (axis2.apache.org.xsd.RegisterGoogleAppsTenant)getTestObject(axis2.apache.org.xsd.RegisterGoogleAppsTenant.class);
                    // TODO : Fill in the registerGoogleAppsTenant18 here
                
                        assertNotNull(stub.registerGoogleAppsTenant(
                        registerGoogleAppsTenant18));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartregisterGoogleAppsTenant() throws java.lang.Exception{
            org.wso2.carbon.tenant.mgt.services.GAppTenantRegistrationServiceStub stub = new org.wso2.carbon.tenant.mgt.services.GAppTenantRegistrationServiceStub();
             axis2.apache.org.xsd.RegisterGoogleAppsTenant registerGoogleAppsTenant18=
                                                        (axis2.apache.org.xsd.RegisterGoogleAppsTenant)getTestObject(axis2.apache.org.xsd.RegisterGoogleAppsTenant.class);
                    // TODO : Fill in the registerGoogleAppsTenant18 here
                

                stub.startregisterGoogleAppsTenant(
                         registerGoogleAppsTenant18,
                    new tempCallbackN1000C()
                );
              


        }

        private class tempCallbackN1000C  extends org.wso2.carbon.tenant.mgt.services.GAppTenantRegistrationServiceCallbackHandler{
            public tempCallbackN1000C(){ super(null);}

            public void receiveResultregisterGoogleAppsTenant(
                         axis2.apache.org.xsd.RegisterGoogleAppsTenantResponse result
                            ) {
                
            }

            public void receiveErrorregisterGoogleAppsTenant(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    


/**
 * AdminManagementServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.admin.mgt.services;

    /*
     *  AdminManagementServiceTest Junit test case
    */

    public class AdminManagementServiceTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testconfirmUser() throws java.lang.Exception{

        org.wso2.carbon.admin.mgt.services.AdminManagementServiceStub stub =
                    new org.wso2.carbon.admin.mgt.services.AdminManagementServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.admin.mgt.services.ConfirmUser confirmUser18=
                                                        (org.wso2.carbon.admin.mgt.services.ConfirmUser)getTestObject(org.wso2.carbon.admin.mgt.services.ConfirmUser.class);
                    // TODO : Fill in the confirmUser18 here
                
                        assertNotNull(stub.confirmUser(
                        confirmUser18));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartconfirmUser() throws java.lang.Exception{
            org.wso2.carbon.admin.mgt.services.AdminManagementServiceStub stub = new org.wso2.carbon.admin.mgt.services.AdminManagementServiceStub();
             org.wso2.carbon.admin.mgt.services.ConfirmUser confirmUser18=
                                                        (org.wso2.carbon.admin.mgt.services.ConfirmUser)getTestObject(org.wso2.carbon.admin.mgt.services.ConfirmUser.class);
                    // TODO : Fill in the confirmUser18 here
                

                stub.startconfirmUser(
                         confirmUser18,
                    new tempCallbackN1000C()
                );
              


        }

        private class tempCallbackN1000C  extends org.wso2.carbon.admin.mgt.services.AdminManagementServiceCallbackHandler{
            public tempCallbackN1000C(){ super(null);}

            public void receiveResultconfirmUser(
                         org.wso2.carbon.admin.mgt.services.ConfirmUserResponse result
                            ) {
                
            }

            public void receiveErrorconfirmUser(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    
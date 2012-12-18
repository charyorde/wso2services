

/**
 * ValidateDomainAdminServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.validate.domain.services;

    /*
     *  ValidateDomainAdminServiceTest Junit test case
    */

    public class ValidateDomainAdminServiceTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testvalidateByTextInRoot() throws java.lang.Exception{

        org.wso2.carbon.validate.domain.services.ValidateDomainAdminServiceStub stub =
                    new org.wso2.carbon.validate.domain.services.ValidateDomainAdminServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.validate.domain.services.ValidateByTextInRoot validateByTextInRoot54=
                                                        (org.wso2.carbon.validate.domain.services.ValidateByTextInRoot)getTestObject(org.wso2.carbon.validate.domain.services.ValidateByTextInRoot.class);
                    // TODO : Fill in the validateByTextInRoot54 here
                
                        assertNotNull(stub.validateByTextInRoot(
                        validateByTextInRoot54));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartvalidateByTextInRoot() throws java.lang.Exception{
            org.wso2.carbon.validate.domain.services.ValidateDomainAdminServiceStub stub = new org.wso2.carbon.validate.domain.services.ValidateDomainAdminServiceStub();
             org.wso2.carbon.validate.domain.services.ValidateByTextInRoot validateByTextInRoot54=
                                                        (org.wso2.carbon.validate.domain.services.ValidateByTextInRoot)getTestObject(org.wso2.carbon.validate.domain.services.ValidateByTextInRoot.class);
                    // TODO : Fill in the validateByTextInRoot54 here
                

                stub.startvalidateByTextInRoot(
                         validateByTextInRoot54,
                    new tempCallbackN1000C()
                );
              


        }

        private class tempCallbackN1000C  extends org.wso2.carbon.validate.domain.services.ValidateDomainAdminServiceCallbackHandler{
            public tempCallbackN1000C(){ super(null);}

            public void receiveResultvalidateByTextInRoot(
                         org.wso2.carbon.validate.domain.services.ValidateByTextInRootResponse result
                            ) {
                
            }

            public void receiveErrorvalidateByTextInRoot(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testvalidateByDNSEntry() throws java.lang.Exception{

        org.wso2.carbon.validate.domain.services.ValidateDomainAdminServiceStub stub =
                    new org.wso2.carbon.validate.domain.services.ValidateDomainAdminServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.validate.domain.services.ValidateByDNSEntry validateByDNSEntry56=
                                                        (org.wso2.carbon.validate.domain.services.ValidateByDNSEntry)getTestObject(org.wso2.carbon.validate.domain.services.ValidateByDNSEntry.class);
                    // TODO : Fill in the validateByDNSEntry56 here
                
                        assertNotNull(stub.validateByDNSEntry(
                        validateByDNSEntry56));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartvalidateByDNSEntry() throws java.lang.Exception{
            org.wso2.carbon.validate.domain.services.ValidateDomainAdminServiceStub stub = new org.wso2.carbon.validate.domain.services.ValidateDomainAdminServiceStub();
             org.wso2.carbon.validate.domain.services.ValidateByDNSEntry validateByDNSEntry56=
                                                        (org.wso2.carbon.validate.domain.services.ValidateByDNSEntry)getTestObject(org.wso2.carbon.validate.domain.services.ValidateByDNSEntry.class);
                    // TODO : Fill in the validateByDNSEntry56 here
                

                stub.startvalidateByDNSEntry(
                         validateByDNSEntry56,
                    new tempCallbackN10049()
                );
              


        }

        private class tempCallbackN10049  extends org.wso2.carbon.validate.domain.services.ValidateDomainAdminServiceCallbackHandler{
            public tempCallbackN10049(){ super(null);}

            public void receiveResultvalidateByDNSEntry(
                         org.wso2.carbon.validate.domain.services.ValidateByDNSEntryResponse result
                            ) {
                
            }

            public void receiveErrorvalidateByDNSEntry(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetDomainValidationKey() throws java.lang.Exception{

        org.wso2.carbon.validate.domain.services.ValidateDomainAdminServiceStub stub =
                    new org.wso2.carbon.validate.domain.services.ValidateDomainAdminServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.validate.domain.services.GetDomainValidationKey getDomainValidationKey58=
                                                        (org.wso2.carbon.validate.domain.services.GetDomainValidationKey)getTestObject(org.wso2.carbon.validate.domain.services.GetDomainValidationKey.class);
                    // TODO : Fill in the getDomainValidationKey58 here
                
                        assertNotNull(stub.getDomainValidationKey(
                        getDomainValidationKey58));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetDomainValidationKey() throws java.lang.Exception{
            org.wso2.carbon.validate.domain.services.ValidateDomainAdminServiceStub stub = new org.wso2.carbon.validate.domain.services.ValidateDomainAdminServiceStub();
             org.wso2.carbon.validate.domain.services.GetDomainValidationKey getDomainValidationKey58=
                                                        (org.wso2.carbon.validate.domain.services.GetDomainValidationKey)getTestObject(org.wso2.carbon.validate.domain.services.GetDomainValidationKey.class);
                    // TODO : Fill in the getDomainValidationKey58 here
                

                stub.startgetDomainValidationKey(
                         getDomainValidationKey58,
                    new tempCallbackN10086()
                );
              


        }

        private class tempCallbackN10086  extends org.wso2.carbon.validate.domain.services.ValidateDomainAdminServiceCallbackHandler{
            public tempCallbackN10086(){ super(null);}

            public void receiveResultgetDomainValidationKey(
                         org.wso2.carbon.validate.domain.services.GetDomainValidationKeyResponse result
                            ) {
                
            }

            public void receiveErrorgetDomainValidationKey(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    
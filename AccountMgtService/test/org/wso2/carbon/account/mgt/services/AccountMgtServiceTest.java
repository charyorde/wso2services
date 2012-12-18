

/**
 * AccountMgtServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.account.mgt.services;

    /*
     *  AccountMgtServiceTest Junit test case
    */

    public class AccountMgtServiceTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testfinishedDomainValidation() throws java.lang.Exception{

        org.wso2.carbon.account.mgt.services.AccountMgtServiceStub stub =
                    new org.wso2.carbon.account.mgt.services.AccountMgtServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.account.mgt.services.FinishedDomainValidation finishedDomainValidation164=
                                                        (org.wso2.carbon.account.mgt.services.FinishedDomainValidation)getTestObject(org.wso2.carbon.account.mgt.services.FinishedDomainValidation.class);
                    // TODO : Fill in the finishedDomainValidation164 here
                
                        assertNotNull(stub.finishedDomainValidation(
                        finishedDomainValidation164));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartfinishedDomainValidation() throws java.lang.Exception{
            org.wso2.carbon.account.mgt.services.AccountMgtServiceStub stub = new org.wso2.carbon.account.mgt.services.AccountMgtServiceStub();
             org.wso2.carbon.account.mgt.services.FinishedDomainValidation finishedDomainValidation164=
                                                        (org.wso2.carbon.account.mgt.services.FinishedDomainValidation)getTestObject(org.wso2.carbon.account.mgt.services.FinishedDomainValidation.class);
                    // TODO : Fill in the finishedDomainValidation164 here
                

                stub.startfinishedDomainValidation(
                         finishedDomainValidation164,
                    new tempCallbackN1000C()
                );
              


        }

        private class tempCallbackN1000C  extends org.wso2.carbon.account.mgt.services.AccountMgtServiceCallbackHandler{
            public tempCallbackN1000C(){ super(null);}

            public void receiveResultfinishedDomainValidation(
                         org.wso2.carbon.account.mgt.services.FinishedDomainValidationResponse result
                            ) {
                
            }

            public void receiveErrorfinishedDomainValidation(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testupdateContact() throws java.lang.Exception{

        org.wso2.carbon.account.mgt.services.AccountMgtServiceStub stub =
                    new org.wso2.carbon.account.mgt.services.AccountMgtServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.account.mgt.services.UpdateContact updateContact166=
                                                        (org.wso2.carbon.account.mgt.services.UpdateContact)getTestObject(org.wso2.carbon.account.mgt.services.UpdateContact.class);
                    // TODO : Fill in the updateContact166 here
                
                    
                    //There is no output to be tested!
                    stub.updateContact(
                        updateContact166);
                    



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartupdateContact() throws java.lang.Exception{
            org.wso2.carbon.account.mgt.services.AccountMgtServiceStub stub = new org.wso2.carbon.account.mgt.services.AccountMgtServiceStub();
             org.wso2.carbon.account.mgt.services.UpdateContact updateContact166=
                                                        (org.wso2.carbon.account.mgt.services.UpdateContact)getTestObject(org.wso2.carbon.account.mgt.services.UpdateContact.class);
                    // TODO : Fill in the updateContact166 here
                

                stub.startupdateContact(
                         updateContact166,
                    new tempCallbackN10049()
                );
              


        }

        private class tempCallbackN10049  extends org.wso2.carbon.account.mgt.services.AccountMgtServiceCallbackHandler{
            public tempCallbackN10049(){ super(null);}

            public void receiveResultupdateContact(
                         ) {
                
            }

            public void receiveErrorupdateContact(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetFullname() throws java.lang.Exception{

        org.wso2.carbon.account.mgt.services.AccountMgtServiceStub stub =
                    new org.wso2.carbon.account.mgt.services.AccountMgtServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.account.mgt.services.GetFullname getFullname168=
                                                        (org.wso2.carbon.account.mgt.services.GetFullname)getTestObject(org.wso2.carbon.account.mgt.services.GetFullname.class);
                    // TODO : Fill in the getFullname168 here
                
                        assertNotNull(stub.getFullname(
                        getFullname168));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetFullname() throws java.lang.Exception{
            org.wso2.carbon.account.mgt.services.AccountMgtServiceStub stub = new org.wso2.carbon.account.mgt.services.AccountMgtServiceStub();
             org.wso2.carbon.account.mgt.services.GetFullname getFullname168=
                                                        (org.wso2.carbon.account.mgt.services.GetFullname)getTestObject(org.wso2.carbon.account.mgt.services.GetFullname.class);
                    // TODO : Fill in the getFullname168 here
                

                stub.startgetFullname(
                         getFullname168,
                    new tempCallbackN10083()
                );
              


        }

        private class tempCallbackN10083  extends org.wso2.carbon.account.mgt.services.AccountMgtServiceCallbackHandler{
            public tempCallbackN10083(){ super(null);}

            public void receiveResultgetFullname(
                         org.wso2.carbon.account.mgt.services.GetFullnameResponse result
                            ) {
                
            }

            public void receiveErrorgetFullname(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetContact() throws java.lang.Exception{

        org.wso2.carbon.account.mgt.services.AccountMgtServiceStub stub =
                    new org.wso2.carbon.account.mgt.services.AccountMgtServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.account.mgt.services.GetContact getContact170=
                                                        (org.wso2.carbon.account.mgt.services.GetContact)getTestObject(org.wso2.carbon.account.mgt.services.GetContact.class);
                    // TODO : Fill in the getContact170 here
                
                        assertNotNull(stub.getContact(
                        getContact170));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetContact() throws java.lang.Exception{
            org.wso2.carbon.account.mgt.services.AccountMgtServiceStub stub = new org.wso2.carbon.account.mgt.services.AccountMgtServiceStub();
             org.wso2.carbon.account.mgt.services.GetContact getContact170=
                                                        (org.wso2.carbon.account.mgt.services.GetContact)getTestObject(org.wso2.carbon.account.mgt.services.GetContact.class);
                    // TODO : Fill in the getContact170 here
                

                stub.startgetContact(
                         getContact170,
                    new tempCallbackN100C0()
                );
              


        }

        private class tempCallbackN100C0  extends org.wso2.carbon.account.mgt.services.AccountMgtServiceCallbackHandler{
            public tempCallbackN100C0(){ super(null);}

            public void receiveResultgetContact(
                         org.wso2.carbon.account.mgt.services.GetContactResponse result
                            ) {
                
            }

            public void receiveErrorgetContact(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testisEmailValidated() throws java.lang.Exception{

        org.wso2.carbon.account.mgt.services.AccountMgtServiceStub stub =
                    new org.wso2.carbon.account.mgt.services.AccountMgtServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.account.mgt.services.IsEmailValidated isEmailValidated172=
                                                        (org.wso2.carbon.account.mgt.services.IsEmailValidated)getTestObject(org.wso2.carbon.account.mgt.services.IsEmailValidated.class);
                    // TODO : Fill in the isEmailValidated172 here
                
                        assertNotNull(stub.isEmailValidated(
                        isEmailValidated172));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartisEmailValidated() throws java.lang.Exception{
            org.wso2.carbon.account.mgt.services.AccountMgtServiceStub stub = new org.wso2.carbon.account.mgt.services.AccountMgtServiceStub();
             org.wso2.carbon.account.mgt.services.IsEmailValidated isEmailValidated172=
                                                        (org.wso2.carbon.account.mgt.services.IsEmailValidated)getTestObject(org.wso2.carbon.account.mgt.services.IsEmailValidated.class);
                    // TODO : Fill in the isEmailValidated172 here
                

                stub.startisEmailValidated(
                         isEmailValidated172,
                    new tempCallbackN100FD()
                );
              


        }

        private class tempCallbackN100FD  extends org.wso2.carbon.account.mgt.services.AccountMgtServiceCallbackHandler{
            public tempCallbackN100FD(){ super(null);}

            public void receiveResultisEmailValidated(
                         org.wso2.carbon.account.mgt.services.IsEmailValidatedResponse result
                            ) {
                
            }

            public void receiveErrorisEmailValidated(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testisDomainValidated() throws java.lang.Exception{

        org.wso2.carbon.account.mgt.services.AccountMgtServiceStub stub =
                    new org.wso2.carbon.account.mgt.services.AccountMgtServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.account.mgt.services.IsDomainValidated isDomainValidated174=
                                                        (org.wso2.carbon.account.mgt.services.IsDomainValidated)getTestObject(org.wso2.carbon.account.mgt.services.IsDomainValidated.class);
                    // TODO : Fill in the isDomainValidated174 here
                
                        assertNotNull(stub.isDomainValidated(
                        isDomainValidated174));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartisDomainValidated() throws java.lang.Exception{
            org.wso2.carbon.account.mgt.services.AccountMgtServiceStub stub = new org.wso2.carbon.account.mgt.services.AccountMgtServiceStub();
             org.wso2.carbon.account.mgt.services.IsDomainValidated isDomainValidated174=
                                                        (org.wso2.carbon.account.mgt.services.IsDomainValidated)getTestObject(org.wso2.carbon.account.mgt.services.IsDomainValidated.class);
                    // TODO : Fill in the isDomainValidated174 here
                

                stub.startisDomainValidated(
                         isDomainValidated174,
                    new tempCallbackN1013A()
                );
              


        }

        private class tempCallbackN1013A  extends org.wso2.carbon.account.mgt.services.AccountMgtServiceCallbackHandler{
            public tempCallbackN1013A(){ super(null);}

            public void receiveResultisDomainValidated(
                         org.wso2.carbon.account.mgt.services.IsDomainValidatedResponse result
                            ) {
                
            }

            public void receiveErrorisDomainValidated(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testupdateFullname() throws java.lang.Exception{

        org.wso2.carbon.account.mgt.services.AccountMgtServiceStub stub =
                    new org.wso2.carbon.account.mgt.services.AccountMgtServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.account.mgt.services.UpdateFullname updateFullname176=
                                                        (org.wso2.carbon.account.mgt.services.UpdateFullname)getTestObject(org.wso2.carbon.account.mgt.services.UpdateFullname.class);
                    // TODO : Fill in the updateFullname176 here
                
                        assertNotNull(stub.updateFullname(
                        updateFullname176));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartupdateFullname() throws java.lang.Exception{
            org.wso2.carbon.account.mgt.services.AccountMgtServiceStub stub = new org.wso2.carbon.account.mgt.services.AccountMgtServiceStub();
             org.wso2.carbon.account.mgt.services.UpdateFullname updateFullname176=
                                                        (org.wso2.carbon.account.mgt.services.UpdateFullname)getTestObject(org.wso2.carbon.account.mgt.services.UpdateFullname.class);
                    // TODO : Fill in the updateFullname176 here
                

                stub.startupdateFullname(
                         updateFullname176,
                    new tempCallbackN10177()
                );
              


        }

        private class tempCallbackN10177  extends org.wso2.carbon.account.mgt.services.AccountMgtServiceCallbackHandler{
            public tempCallbackN10177(){ super(null);}

            public void receiveResultupdateFullname(
                         org.wso2.carbon.account.mgt.services.UpdateFullnameResponse result
                            ) {
                
            }

            public void receiveErrorupdateFullname(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testdeactivate() throws java.lang.Exception{

        org.wso2.carbon.account.mgt.services.AccountMgtServiceStub stub =
                    new org.wso2.carbon.account.mgt.services.AccountMgtServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.account.mgt.services.Deactivate deactivate178=
                                                        (org.wso2.carbon.account.mgt.services.Deactivate)getTestObject(org.wso2.carbon.account.mgt.services.Deactivate.class);
                    // TODO : Fill in the deactivate178 here
                
                    
                    //There is no output to be tested!
                    stub.deactivate(
                        deactivate178);
                    



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartdeactivate() throws java.lang.Exception{
            org.wso2.carbon.account.mgt.services.AccountMgtServiceStub stub = new org.wso2.carbon.account.mgt.services.AccountMgtServiceStub();
             org.wso2.carbon.account.mgt.services.Deactivate deactivate178=
                                                        (org.wso2.carbon.account.mgt.services.Deactivate)getTestObject(org.wso2.carbon.account.mgt.services.Deactivate.class);
                    // TODO : Fill in the deactivate178 here
                

                stub.startdeactivate(
                         deactivate178,
                    new tempCallbackN101B4()
                );
              


        }

        private class tempCallbackN101B4  extends org.wso2.carbon.account.mgt.services.AccountMgtServiceCallbackHandler{
            public tempCallbackN101B4(){ super(null);}

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
        public  void testcheckDomainAvailability() throws java.lang.Exception{

        org.wso2.carbon.account.mgt.services.AccountMgtServiceStub stub =
                    new org.wso2.carbon.account.mgt.services.AccountMgtServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.account.mgt.services.CheckDomainAvailability checkDomainAvailability180=
                                                        (org.wso2.carbon.account.mgt.services.CheckDomainAvailability)getTestObject(org.wso2.carbon.account.mgt.services.CheckDomainAvailability.class);
                    // TODO : Fill in the checkDomainAvailability180 here
                
                        assertNotNull(stub.checkDomainAvailability(
                        checkDomainAvailability180));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartcheckDomainAvailability() throws java.lang.Exception{
            org.wso2.carbon.account.mgt.services.AccountMgtServiceStub stub = new org.wso2.carbon.account.mgt.services.AccountMgtServiceStub();
             org.wso2.carbon.account.mgt.services.CheckDomainAvailability checkDomainAvailability180=
                                                        (org.wso2.carbon.account.mgt.services.CheckDomainAvailability)getTestObject(org.wso2.carbon.account.mgt.services.CheckDomainAvailability.class);
                    // TODO : Fill in the checkDomainAvailability180 here
                

                stub.startcheckDomainAvailability(
                         checkDomainAvailability180,
                    new tempCallbackN101EE()
                );
              


        }

        private class tempCallbackN101EE  extends org.wso2.carbon.account.mgt.services.AccountMgtServiceCallbackHandler{
            public tempCallbackN101EE(){ super(null);}

            public void receiveResultcheckDomainAvailability(
                         org.wso2.carbon.account.mgt.services.CheckDomainAvailabilityResponse result
                            ) {
                
            }

            public void receiveErrorcheckDomainAvailability(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    
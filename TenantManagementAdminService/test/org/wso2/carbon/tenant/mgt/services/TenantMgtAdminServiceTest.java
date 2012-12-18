

/**
 * TenantMgtAdminServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.tenant.mgt.services;

    /*
     *  TenantMgtAdminServiceTest Junit test case
    */

    public class TenantMgtAdminServiceTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testupdateTenant() throws java.lang.Exception{

        org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub stub =
                    new org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.tenant.mgt.services.UpdateTenant updateTenant156=
                                                        (org.wso2.carbon.tenant.mgt.services.UpdateTenant)getTestObject(org.wso2.carbon.tenant.mgt.services.UpdateTenant.class);
                    // TODO : Fill in the updateTenant156 here
                
                    
                    //There is no output to be tested!
                    stub.updateTenant(
                        updateTenant156);
                    



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartupdateTenant() throws java.lang.Exception{
            org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub stub = new org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub();
             org.wso2.carbon.tenant.mgt.services.UpdateTenant updateTenant156=
                                                        (org.wso2.carbon.tenant.mgt.services.UpdateTenant)getTestObject(org.wso2.carbon.tenant.mgt.services.UpdateTenant.class);
                    // TODO : Fill in the updateTenant156 here
                

                stub.startupdateTenant(
                         updateTenant156,
                    new tempCallbackN1000C()
                );
              


        }

        private class tempCallbackN1000C  extends org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceCallbackHandler{
            public tempCallbackN1000C(){ super(null);}

            public void receiveResultupdateTenant(
                         ) {
                
            }

            public void receiveErrorupdateTenant(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testdeactivateTenant() throws java.lang.Exception{

        org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub stub =
                    new org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.tenant.mgt.services.DeactivateTenant deactivateTenant158=
                                                        (org.wso2.carbon.tenant.mgt.services.DeactivateTenant)getTestObject(org.wso2.carbon.tenant.mgt.services.DeactivateTenant.class);
                    // TODO : Fill in the deactivateTenant158 here
                
                    
                    //There is no output to be tested!
                    stub.deactivateTenant(
                        deactivateTenant158);
                    



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartdeactivateTenant() throws java.lang.Exception{
            org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub stub = new org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub();
             org.wso2.carbon.tenant.mgt.services.DeactivateTenant deactivateTenant158=
                                                        (org.wso2.carbon.tenant.mgt.services.DeactivateTenant)getTestObject(org.wso2.carbon.tenant.mgt.services.DeactivateTenant.class);
                    // TODO : Fill in the deactivateTenant158 here
                

                stub.startdeactivateTenant(
                         deactivateTenant158,
                    new tempCallbackN10046()
                );
              


        }

        private class tempCallbackN10046  extends org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceCallbackHandler{
            public tempCallbackN10046(){ super(null);}

            public void receiveResultdeactivateTenant(
                         ) {
                
            }

            public void receiveErrordeactivateTenant(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testactivateTenant() throws java.lang.Exception{

        org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub stub =
                    new org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.tenant.mgt.services.ActivateTenant activateTenant160=
                                                        (org.wso2.carbon.tenant.mgt.services.ActivateTenant)getTestObject(org.wso2.carbon.tenant.mgt.services.ActivateTenant.class);
                    // TODO : Fill in the activateTenant160 here
                
                    
                    //There is no output to be tested!
                    stub.activateTenant(
                        activateTenant160);
                    



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartactivateTenant() throws java.lang.Exception{
            org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub stub = new org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub();
             org.wso2.carbon.tenant.mgt.services.ActivateTenant activateTenant160=
                                                        (org.wso2.carbon.tenant.mgt.services.ActivateTenant)getTestObject(org.wso2.carbon.tenant.mgt.services.ActivateTenant.class);
                    // TODO : Fill in the activateTenant160 here
                

                stub.startactivateTenant(
                         activateTenant160,
                    new tempCallbackN10080()
                );
              


        }

        private class tempCallbackN10080  extends org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceCallbackHandler{
            public tempCallbackN10080(){ super(null);}

            public void receiveResultactivateTenant(
                         ) {
                
            }

            public void receiveErroractivateTenant(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testretrieveTenants() throws java.lang.Exception{

        org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub stub =
                    new org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.tenant.mgt.services.RetrieveTenants retrieveTenants162=
                                                        (org.wso2.carbon.tenant.mgt.services.RetrieveTenants)getTestObject(org.wso2.carbon.tenant.mgt.services.RetrieveTenants.class);
                    // TODO : Fill in the retrieveTenants162 here
                
                        assertNotNull(stub.retrieveTenants(
                        retrieveTenants162));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartretrieveTenants() throws java.lang.Exception{
            org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub stub = new org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub();
             org.wso2.carbon.tenant.mgt.services.RetrieveTenants retrieveTenants162=
                                                        (org.wso2.carbon.tenant.mgt.services.RetrieveTenants)getTestObject(org.wso2.carbon.tenant.mgt.services.RetrieveTenants.class);
                    // TODO : Fill in the retrieveTenants162 here
                

                stub.startretrieveTenants(
                         retrieveTenants162,
                    new tempCallbackN100BA()
                );
              


        }

        private class tempCallbackN100BA  extends org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceCallbackHandler{
            public tempCallbackN100BA(){ super(null);}

            public void receiveResultretrieveTenants(
                         org.wso2.carbon.tenant.mgt.services.RetrieveTenantsResponse result
                            ) {
                
            }

            public void receiveErrorretrieveTenants(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetTenant() throws java.lang.Exception{

        org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub stub =
                    new org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.tenant.mgt.services.GetTenant getTenant164=
                                                        (org.wso2.carbon.tenant.mgt.services.GetTenant)getTestObject(org.wso2.carbon.tenant.mgt.services.GetTenant.class);
                    // TODO : Fill in the getTenant164 here
                
                        assertNotNull(stub.getTenant(
                        getTenant164));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetTenant() throws java.lang.Exception{
            org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub stub = new org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub();
             org.wso2.carbon.tenant.mgt.services.GetTenant getTenant164=
                                                        (org.wso2.carbon.tenant.mgt.services.GetTenant)getTestObject(org.wso2.carbon.tenant.mgt.services.GetTenant.class);
                    // TODO : Fill in the getTenant164 here
                

                stub.startgetTenant(
                         getTenant164,
                    new tempCallbackN100F7()
                );
              


        }

        private class tempCallbackN100F7  extends org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceCallbackHandler{
            public tempCallbackN100F7(){ super(null);}

            public void receiveResultgetTenant(
                         org.wso2.carbon.tenant.mgt.services.GetTenantResponse result
                            ) {
                
            }

            public void receiveErrorgetTenant(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testretrievePaginatedTenants() throws java.lang.Exception{

        org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub stub =
                    new org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.tenant.mgt.services.RetrievePaginatedTenants retrievePaginatedTenants166=
                                                        (org.wso2.carbon.tenant.mgt.services.RetrievePaginatedTenants)getTestObject(org.wso2.carbon.tenant.mgt.services.RetrievePaginatedTenants.class);
                    // TODO : Fill in the retrievePaginatedTenants166 here
                
                        assertNotNull(stub.retrievePaginatedTenants(
                        retrievePaginatedTenants166));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartretrievePaginatedTenants() throws java.lang.Exception{
            org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub stub = new org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub();
             org.wso2.carbon.tenant.mgt.services.RetrievePaginatedTenants retrievePaginatedTenants166=
                                                        (org.wso2.carbon.tenant.mgt.services.RetrievePaginatedTenants)getTestObject(org.wso2.carbon.tenant.mgt.services.RetrievePaginatedTenants.class);
                    // TODO : Fill in the retrievePaginatedTenants166 here
                

                stub.startretrievePaginatedTenants(
                         retrievePaginatedTenants166,
                    new tempCallbackN10134()
                );
              


        }

        private class tempCallbackN10134  extends org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceCallbackHandler{
            public tempCallbackN10134(){ super(null);}

            public void receiveResultretrievePaginatedTenants(
                         org.wso2.carbon.tenant.mgt.services.RetrievePaginatedTenantsResponse result
                            ) {
                
            }

            public void receiveErrorretrievePaginatedTenants(java.lang.Exception e) {
                fail();
            }

        }
      
          /**
          * Auto generated test method
          */
          public  void testrestartTenant() throws java.lang.Exception{

          org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub stub =
          new org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub();//the default implementation should point to the right endpoint
          org.wso2.carbon.tenant.mgt.services.RestartTenant restartTenant168=
                  (org.wso2.carbon.tenant.mgt.services.RestartTenant)getTestObject(org.wso2.carbon.tenant.mgt.services.RestartTenant.class);
                      // TODO : Fill in the restartTenant168 here
                  

                  //There is no output to be tested!
                  stub.restartTenant(
                  restartTenant168);

              
          }
      
        /**
         * Auto generated test method
         */
        public  void testaddTenant() throws java.lang.Exception{

        org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub stub =
                    new org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.tenant.mgt.services.AddTenant addTenant169=
                                                        (org.wso2.carbon.tenant.mgt.services.AddTenant)getTestObject(org.wso2.carbon.tenant.mgt.services.AddTenant.class);
                    // TODO : Fill in the addTenant169 here
                
                        assertNotNull(stub.addTenant(
                        addTenant169));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartaddTenant() throws java.lang.Exception{
            org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub stub = new org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub();
             org.wso2.carbon.tenant.mgt.services.AddTenant addTenant169=
                                                        (org.wso2.carbon.tenant.mgt.services.AddTenant)getTestObject(org.wso2.carbon.tenant.mgt.services.AddTenant.class);
                    // TODO : Fill in the addTenant169 here
                

                stub.startaddTenant(
                         addTenant169,
                    new tempCallbackN101A1()
                );
              


        }

        private class tempCallbackN101A1  extends org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceCallbackHandler{
            public tempCallbackN101A1(){ super(null);}

            public void receiveResultaddTenant(
                         org.wso2.carbon.tenant.mgt.services.AddTenantResponse result
                            ) {
                
            }

            public void receiveErroraddTenant(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testupdateTenantPassword() throws java.lang.Exception{

        org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub stub =
                    new org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub();//the default implementation should point to the right endpoint

           org.wso2.carbon.tenant.mgt.services.UpdateTenantPassword updateTenantPassword171=
                                                        (org.wso2.carbon.tenant.mgt.services.UpdateTenantPassword)getTestObject(org.wso2.carbon.tenant.mgt.services.UpdateTenantPassword.class);
                    // TODO : Fill in the updateTenantPassword171 here
                
                        assertNotNull(stub.updateTenantPassword(
                        updateTenantPassword171));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartupdateTenantPassword() throws java.lang.Exception{
            org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub stub = new org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceStub();
             org.wso2.carbon.tenant.mgt.services.UpdateTenantPassword updateTenantPassword171=
                                                        (org.wso2.carbon.tenant.mgt.services.UpdateTenantPassword)getTestObject(org.wso2.carbon.tenant.mgt.services.UpdateTenantPassword.class);
                    // TODO : Fill in the updateTenantPassword171 here
                

                stub.startupdateTenantPassword(
                         updateTenantPassword171,
                    new tempCallbackN101DE()
                );
              


        }

        private class tempCallbackN101DE  extends org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceCallbackHandler{
            public tempCallbackN101DE(){ super(null);}

            public void receiveResultupdateTenantPassword(
                         org.wso2.carbon.tenant.mgt.services.UpdateTenantPasswordResponse result
                            ) {
                
            }

            public void receiveErrorupdateTenantPassword(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    
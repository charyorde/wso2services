

/**
 * MultitenancyThrottlingServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.throttling.manager.services;

    /*
     *  MultitenancyThrottlingServiceTest Junit test case
    */

    public class MultitenancyThrottlingServiceTest extends junit.framework.TestCase{

     
          /**
          * Auto generated test method
          */
          public  void testexecuteThrottlingRules() throws java.lang.Exception{

          org.wso2.carbon.throttling.manager.services.MultitenancyThrottlingServiceStub stub =
          new org.wso2.carbon.throttling.manager.services.MultitenancyThrottlingServiceStub();//the default implementation should point to the right endpoint
          org.wso2.carbon.throttling.manager.services.ExecuteThrottlingRules executeThrottlingRules9=
                  (org.wso2.carbon.throttling.manager.services.ExecuteThrottlingRules)getTestObject(org.wso2.carbon.throttling.manager.services.ExecuteThrottlingRules.class);
                      // TODO : Fill in the executeThrottlingRules9 here
                  

                  //There is no output to be tested!
                  stub.executeThrottlingRules(
                  executeThrottlingRules9);

              
          }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    
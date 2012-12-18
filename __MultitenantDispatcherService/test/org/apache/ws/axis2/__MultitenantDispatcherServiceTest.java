

/**
 * __MultitenantDispatcherServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.apache.ws.axis2;

    /*
     *  __MultitenantDispatcherServiceTest Junit test case
    */

    public class __MultitenantDispatcherServiceTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testdispatch() throws java.lang.Exception{

        org.apache.ws.axis2.__MultitenantDispatcherServiceStub stub =
                    new org.apache.ws.axis2.__MultitenantDispatcherServiceStub();//the default implementation should point to the right endpoint

           
                    
                    //There is no output to be tested!
                    stub.dispatch(
                        );
                    



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartdispatch() throws java.lang.Exception{
            org.apache.ws.axis2.__MultitenantDispatcherServiceStub stub = new org.apache.ws.axis2.__MultitenantDispatcherServiceStub();
             

                stub.startdispatch(
                         
                    new tempCallbackN1000C()
                );
              


        }

        private class tempCallbackN1000C  extends org.apache.ws.axis2.__MultitenantDispatcherServiceCallbackHandler{
            public tempCallbackN1000C(){ super(null);}

            public void receiveResultdispatch(
                         ) {
                
            }

            public void receiveErrordispatch(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    
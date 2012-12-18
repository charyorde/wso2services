
/**
 * SampleDeployerRegistryExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.sample.installer;

public class SampleDeployerRegistryExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355391931425L;
    
    private org.wso2.carbon.sample.installer.SampleDeployerRegistryException faultMessage;

    
        public SampleDeployerRegistryExceptionException() {
            super("SampleDeployerRegistryExceptionException");
        }

        public SampleDeployerRegistryExceptionException(java.lang.String s) {
           super(s);
        }

        public SampleDeployerRegistryExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public SampleDeployerRegistryExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.sample.installer.SampleDeployerRegistryException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.sample.installer.SampleDeployerRegistryException getFaultMessage(){
       return faultMessage;
    }
}
    
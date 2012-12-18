
/**
 * CustomMeteringServiceUsageExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.usage.agent.services;

public class CustomMeteringServiceUsageExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355390838749L;
    
    private org.wso2.carbon.usage.agent.services.CustomMeteringServiceUsageException faultMessage;

    
        public CustomMeteringServiceUsageExceptionException() {
            super("CustomMeteringServiceUsageExceptionException");
        }

        public CustomMeteringServiceUsageExceptionException(java.lang.String s) {
           super(s);
        }

        public CustomMeteringServiceUsageExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public CustomMeteringServiceUsageExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.usage.agent.services.CustomMeteringServiceUsageException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.usage.agent.services.CustomMeteringServiceUsageException getFaultMessage(){
       return faultMessage;
    }
}
    
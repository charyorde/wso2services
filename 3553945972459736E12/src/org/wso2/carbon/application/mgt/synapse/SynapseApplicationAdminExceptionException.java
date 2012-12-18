
/**
 * SynapseApplicationAdminExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.application.mgt.synapse;

public class SynapseApplicationAdminExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355394597222L;
    
    private org.wso2.carbon.application.mgt.synapse.SynapseApplicationAdminException faultMessage;

    
        public SynapseApplicationAdminExceptionException() {
            super("SynapseApplicationAdminExceptionException");
        }

        public SynapseApplicationAdminExceptionException(java.lang.String s) {
           super(s);
        }

        public SynapseApplicationAdminExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public SynapseApplicationAdminExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.application.mgt.synapse.SynapseApplicationAdminException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.application.mgt.synapse.SynapseApplicationAdminException getFaultMessage(){
       return faultMessage;
    }
}
    
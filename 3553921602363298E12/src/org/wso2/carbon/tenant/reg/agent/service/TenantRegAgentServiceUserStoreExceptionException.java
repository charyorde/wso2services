
/**
 * TenantRegAgentServiceUserStoreExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.tenant.reg.agent.service;

public class TenantRegAgentServiceUserStoreExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355392160203L;
    
    private org.wso2.carbon.tenant.reg.agent.service.TenantRegAgentServiceUserStoreException faultMessage;

    
        public TenantRegAgentServiceUserStoreExceptionException() {
            super("TenantRegAgentServiceUserStoreExceptionException");
        }

        public TenantRegAgentServiceUserStoreExceptionException(java.lang.String s) {
           super(s);
        }

        public TenantRegAgentServiceUserStoreExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public TenantRegAgentServiceUserStoreExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.tenant.reg.agent.service.TenantRegAgentServiceUserStoreException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.tenant.reg.agent.service.TenantRegAgentServiceUserStoreException getFaultMessage(){
       return faultMessage;
    }
}
    
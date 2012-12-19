
/**
 * ManageGenericArtifactServiceExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.governance.generic.services;

public class ManageGenericArtifactServiceExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355397172671L;
    
    private org.wso2.carbon.governance.generic.services.ManageGenericArtifactServiceException faultMessage;

    
        public ManageGenericArtifactServiceExceptionException() {
            super("ManageGenericArtifactServiceExceptionException");
        }

        public ManageGenericArtifactServiceExceptionException(java.lang.String s) {
           super(s);
        }

        public ManageGenericArtifactServiceExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ManageGenericArtifactServiceExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.governance.generic.services.ManageGenericArtifactServiceException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.governance.generic.services.ManageGenericArtifactServiceException getFaultMessage(){
       return faultMessage;
    }
}
    
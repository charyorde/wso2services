
/**
 * MediationTracerServiceMediationTracerExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.mediation.tracer;

public class MediationTracerServiceMediationTracerExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355394660680L;
    
    private org.wso2.carbon.mediation.tracer.MediationTracerServiceMediationTracerException faultMessage;

    
        public MediationTracerServiceMediationTracerExceptionException() {
            super("MediationTracerServiceMediationTracerExceptionException");
        }

        public MediationTracerServiceMediationTracerExceptionException(java.lang.String s) {
           super(s);
        }

        public MediationTracerServiceMediationTracerExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public MediationTracerServiceMediationTracerExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.mediation.tracer.MediationTracerServiceMediationTracerException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.mediation.tracer.MediationTracerServiceMediationTracerException getFaultMessage(){
       return faultMessage;
    }
}
    

/**
 * MediationStatisticsAdminMediationStatisticsExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.mediation.statistics;

public class MediationStatisticsAdminMediationStatisticsExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355394566498L;
    
    private org.wso2.carbon.mediation.statistics.MediationStatisticsAdminMediationStatisticsException faultMessage;

    
        public MediationStatisticsAdminMediationStatisticsExceptionException() {
            super("MediationStatisticsAdminMediationStatisticsExceptionException");
        }

        public MediationStatisticsAdminMediationStatisticsExceptionException(java.lang.String s) {
           super(s);
        }

        public MediationStatisticsAdminMediationStatisticsExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public MediationStatisticsAdminMediationStatisticsExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.mediation.statistics.MediationStatisticsAdminMediationStatisticsException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.mediation.statistics.MediationStatisticsAdminMediationStatisticsException getFaultMessage(){
       return faultMessage;
    }
}
    
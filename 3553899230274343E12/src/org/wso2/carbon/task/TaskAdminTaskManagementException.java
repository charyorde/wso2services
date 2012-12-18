
/**
 * TaskAdminTaskManagementException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.task;

public class TaskAdminTaskManagementException extends java.lang.Exception{

    private static final long serialVersionUID = 1355389923000L;
    
    private axis2.apache.org.xsd.TaskAdminTaskManagementException faultMessage;

    
        public TaskAdminTaskManagementException() {
            super("TaskAdminTaskManagementException");
        }

        public TaskAdminTaskManagementException(java.lang.String s) {
           super(s);
        }

        public TaskAdminTaskManagementException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public TaskAdminTaskManagementException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(axis2.apache.org.xsd.TaskAdminTaskManagementException msg){
       faultMessage = msg;
    }
    
    public axis2.apache.org.xsd.TaskAdminTaskManagementException getFaultMessage(){
       return faultMessage;
    }
}
    

/**
 * TokenBasedAuthenticatorAuthenticationExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.identity.authenticator.token;

public class TokenBasedAuthenticatorAuthenticationExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355390725831L;
    
    private org.wso2.carbon.identity.authenticator.token.TokenBasedAuthenticatorAuthenticationException faultMessage;

    
        public TokenBasedAuthenticatorAuthenticationExceptionException() {
            super("TokenBasedAuthenticatorAuthenticationExceptionException");
        }

        public TokenBasedAuthenticatorAuthenticationExceptionException(java.lang.String s) {
           super(s);
        }

        public TokenBasedAuthenticatorAuthenticationExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public TokenBasedAuthenticatorAuthenticationExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.identity.authenticator.token.TokenBasedAuthenticatorAuthenticationException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.identity.authenticator.token.TokenBasedAuthenticatorAuthenticationException getFaultMessage(){
       return faultMessage;
    }
}
    
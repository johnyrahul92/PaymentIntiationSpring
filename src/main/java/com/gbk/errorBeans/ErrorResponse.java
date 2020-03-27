package com.gbk.errorBeans;

import java.util.List;

public class ErrorResponse {

    private List<ErrorDetails> errorDetailsList;
    private String interactionId;
    private String responseTimeStamp;
    private String serverStatusCode;
    private String sessionId;

    public List<ErrorDetails> getErrorDetailsList() {
        return errorDetailsList;
    }

    public void setErrorDetailsList(List<ErrorDetails> errorDetailsList) {
        this.errorDetailsList = errorDetailsList;
    }

    public String getInteractionId() {
        return interactionId;
    }

    public void setInteractionId(String interactionId) {
        this.interactionId = interactionId;
    }

    public String getResponseTimeStamp() {
        return responseTimeStamp;
    }

    public void setResponseTimeStamp(String responseTimeStamp) {
        this.responseTimeStamp = responseTimeStamp;
    }

    public String getServerStatusCode() {
        return serverStatusCode;
    }

    public void setServerStatusCode(String serverStatusCode) {
        this.serverStatusCode = serverStatusCode;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}

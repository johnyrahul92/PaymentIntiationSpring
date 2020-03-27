package com.gbk.beans.response;

public class PaymentInitiationActivateBeneficiaryResponse {

    private String message;
    private String statusCode;
    private String statusDescription;
    private String transactionReferenceNo;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public String getTransactionReferenceNo() {
        return transactionReferenceNo;
    }

    public void setTransactionReferenceNo(String transactionReferenceNo) {
        this.transactionReferenceNo = transactionReferenceNo;
    }
}

package com.gbk.beans.requests;

public class PaymentInitiationActivateBeneficiaryRequest {

    private String accountType;
    private String activationType;
    private String beneAccNo;
    private String beneName;
    private String pwdActivationFlag;
    private String transferMode;

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getActivationType() {
        return activationType;
    }

    public void setActivationType(String activationType) {
        this.activationType = activationType;
    }

    public String getBeneAccNo() {
        return beneAccNo;
    }

    public void setBeneAccNo(String beneAccNo) {
        this.beneAccNo = beneAccNo;
    }

    public String getBeneName() {
        return beneName;
    }

    public void setBeneName(String beneName) {
        this.beneName = beneName;
    }

    public String getPwdActivationFlag() {
        return pwdActivationFlag;
    }

    public void setPwdActivationFlag(String pwdActivationFlag) {
        this.pwdActivationFlag = pwdActivationFlag;
    }

    public String getTransferMode() {
        return transferMode;
    }

    public void setTransferMode(String transferMode) {
        this.transferMode = transferMode;
    }
}

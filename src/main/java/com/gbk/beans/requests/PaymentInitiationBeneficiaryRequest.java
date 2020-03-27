package com.gbk.beans.requests;

public class PaymentInitiationBeneficiaryRequest {

    private String accountType;
    private String activationType;
    private String beneAccNo;
    private String beneBankName;
    private String beneName;
    private String pwdActivationFlag;
    private String swiftNo;
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

    public String getBeneBankName() {
        return beneBankName;
    }

    public void setBeneBankName(String beneBankName) {
        this.beneBankName = beneBankName;
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

    public String getSwiftNo() {
        return swiftNo;
    }

    public void setSwiftNo(String swiftNo) {
        this.swiftNo = swiftNo;
    }

    public String getTransferMode() {
        return transferMode;
    }

    public void setTransferMode(String transferMode) {
        this.transferMode = transferMode;
    }
}

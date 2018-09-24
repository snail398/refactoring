package com.team.sarafanka.sarafun_refactoring.dto;


public class BarmenOperationHistoryDTO {
    private String barmenAccount;
    private String operationType;
    private Long operationDate;
    private String clientAccount;
    private String action;

    public String getBarmenAccount() {
        return barmenAccount;
    }

    public void setBarmenAccount(String barmenAccount) {
        this.barmenAccount = barmenAccount;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public Long getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(Long operationDate) {
        this.operationDate = operationDate;
    }

    public String getClientAccount() {
        return clientAccount;
    }

    public void setClientAccount(String clientAccount) {
        this.clientAccount = clientAccount;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }


    public BarmenOperationHistoryDTO() {
    }

}

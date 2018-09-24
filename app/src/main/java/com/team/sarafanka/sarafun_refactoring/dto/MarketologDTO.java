package com.team.sarafanka.sarafun_refactoring.dto;



public class MarketologDTO {

    private long id;
    private Long accountID;
    private Integer main;
    private Long companyID;
    private Long establishmentID;

    public MarketologDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getAccountID() {
        return accountID;
    }

    public void setAccountID(Long accountID) {
        this.accountID = accountID;
    }

    public Integer getMain() {
        return main;
    }

    public void setMain(Integer main) {
        this.main = main;
    }

    public Long getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Long companyID) {
        this.companyID = companyID;
    }

    public Long getEstablishmentID() {
        return establishmentID;
    }

    public void setEstablishmentID(Long establishmentID) {
        this.establishmentID = establishmentID;
    }
}

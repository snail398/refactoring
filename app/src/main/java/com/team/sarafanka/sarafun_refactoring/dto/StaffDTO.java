package com.team.sarafanka.sarafun_refactoring.dto;


public class StaffDTO {

    private Long accountID;
    private String staffName;
    private String staffWorkingPlace;

    public StaffDTO() {
    }

    public Long getAccountID() {
        return accountID;
    }

    public void setAccountID(Long accountID) {
        this.accountID = accountID;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffWorkingPlace() {
        return staffWorkingPlace;
    }

    public void setStaffWorkingPlace(String staffWorkingPlace) {
        this.staffWorkingPlace = staffWorkingPlace;
    }
}

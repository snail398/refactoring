package com.team.sarafanka.sarafun_refactoring.dto;


public class EstablishmentDTO {
    private long id;

    private Long companyID;
    private String factAdress;
    private String estName;
    private String estEmail;
    private String estSite;
    private String estDescription;
    private String estPhone;
    private String estWorkTime;
    private String pathToAvatar;
    private Long avatarChangeDate;
    public EstablishmentDTO() {
    }
    public EstablishmentDTO(String estName, String estDescription, String estAddress, String estPhone, String estSite, String estEmail, String estWorkTime) {
        this.setEstName(estName);
        this.setEstDescription(estDescription);
        this.setFactAdress(estAddress);
        this.setEstPhone(estPhone);
        this.setEstSite(estSite);
        this.setEstEmail(estEmail);
        this.setEstWorkTime(estWorkTime);
        this.setCompanyID(Long.valueOf(0));
        this.setPathToAvatar("noavatar");
        this.setAvatarChangeDate(Long.valueOf(0));

    }

    public String getPathToAvatar() {
        return pathToAvatar;
    }

    public void setPathToAvatar(String pathToAvatar) {
        this.pathToAvatar = pathToAvatar;
    }

    public Long getAvatarChangeDate() {
        return avatarChangeDate;
    }

    public void setAvatarChangeDate(Long avatarChangeDate) {
        this.avatarChangeDate = avatarChangeDate;
    }

    public String getEstName() {
        return estName;
    }

    public void setEstName(String estName) {
        this.estName = estName;
    }

    public String getEstEmail() {
        return estEmail;
    }

    public void setEstEmail(String estEmail) {
        this.estEmail = estEmail;
    }

    public String getEstSite() {
        return estSite;
    }

    public void setEstSite(String estSite) {
        this.estSite = estSite;
    }

    public String getEstDescription() {
        return estDescription;
    }

    public void setEstDescription(String estDescription) {
        this.estDescription = estDescription;
    }

    public String getEstWorkTime() {
        return estWorkTime;
    }

    public void setEstWorkTime(String estWorkTime) {
        this.estWorkTime = estWorkTime;
    }

    public String getEstPhone() {
        return estPhone;
    }

    public void setEstPhone(String estPhone) {
        this.estPhone = estPhone;
    }


    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Long companyID) {
        this.companyID = companyID;
    }

    public String getFactAdress() {
        return factAdress;
    }

    public void setFactAdress(String factAdress) {
        this.factAdress = factAdress;
    }



}

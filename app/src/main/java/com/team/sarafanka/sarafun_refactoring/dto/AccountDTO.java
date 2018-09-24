package com.team.sarafanka.sarafun_refactoring.dto;


public class AccountDTO {

    private long id;
    private String login;
    private String password;
    private String accountType;
    private String firstName;
    private String secondName;
    private Long creatingDate;
    private Long avatarChangeDate;
    private String pathToAvatar;

    public Long getCreatingDate() {
        return creatingDate;
    }

    public void setCreatingDate(Long creatingDate) {
        this.creatingDate = creatingDate;
    }

    public Long getAvatarChangeDate() {
        return avatarChangeDate;
    }

    public void setAvatarChangeDate(Long avatarChangeDate) {
        this.avatarChangeDate = avatarChangeDate;
    }

    public String getPathToAvatar() {
        return pathToAvatar;
    }

    public void setPathToAvatar(String pathToAvatar) {
        this.pathToAvatar = pathToAvatar;
    }


    public AccountDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}

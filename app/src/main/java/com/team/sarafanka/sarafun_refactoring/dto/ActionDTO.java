package com.team.sarafanka.sarafun_refactoring.dto;


public class ActionDTO {

    private long id;
    private String title;
    private String description;
    private Long organizationID;
    private Long createdBy;
    private String typeOfAction;
    private String reward;
    private String supportReward;
    private Integer peopleUsed;
    private Integer target;
    private Long timeStart;
    private Long timeEnd;

    public ActionDTO() {
    }



    public Long getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Long timeStart) {
        this.timeStart = timeStart;
    }

    public Long getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Long timeEnd) {
        this.timeEnd = timeEnd;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(Long organizationID) {
        this.organizationID = organizationID;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public String getTypeOfAction() {
        return typeOfAction;
    }

    public void setTypeOfAction(String typeOfAction) {
        this.typeOfAction = typeOfAction;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public Integer getPeopleUsed() {
        return peopleUsed;
    }

    public void setPeopleUsed(Integer peopleUsed) {
        this.peopleUsed = peopleUsed;
    }

    public Integer getTarget() {
        return target;
    }

    public void setTarget(Integer target) {
        this.target = target;
    }
    public String getSupportReward() {
        return supportReward;
    }

    public void setSupportReward(String supportReward) {
        this.supportReward = supportReward;
    }
}

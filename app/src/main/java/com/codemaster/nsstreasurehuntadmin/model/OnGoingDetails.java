package com.codemaster.nsstreasurehuntadmin.model;

public class OnGoingDetails {
    private String userId;
    private OnGoingDetail onGoingDetail;

    public OnGoingDetails() {
        // Default constructor required
    }

    public OnGoingDetails(String userId, OnGoingDetail onGoingDetail) {
        this.userId = userId;
        this.onGoingDetail = onGoingDetail;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCurrQno() {
        return onGoingDetail.getCurrQno();
    }

    public void setCurrQno(String currQno) {
        this.onGoingDetail.setCurrQno(currQno);
    }

    public Object getTime() {
        return onGoingDetail.getTime();
    }

    public void setTime(Object time) {
        this.onGoingDetail.setTime(time);
    }
}

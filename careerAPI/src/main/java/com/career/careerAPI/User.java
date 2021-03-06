package com.career.careerAPI;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
@Component
public class User {

    private int id;
    private Date userDob;
    private String userName;
    private String userType;
    private List<Career> careerList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }



    public Date getUserDob() {
        return userDob;
    }

    public void setUserDob(Date userDob) {
        this.userDob = userDob;
    }


    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public List<Career> getCareerList() {
        return careerList;
    }

    public void setCareerList(List<Career> careerList) {
        this.careerList = careerList;
    }

}

package com.career.careerAPI;

import java.util.List;

public interface Career_Repo {
    //  abstract methods to be used in CareerServiceImpl
    void updateMethod(String oldJobTitle, Career upCareer);
    void addCareer(Career newCareer);
    List<Career> getCareerList();
    void deleteAllCareer();
    Boolean deleteCareer(String delCareer);
    Career searchCareer(String theCareer);
}

package com.career.careerAPI;

import java.util.List;

public interface Career_Repo {
    //  abstract methods to be used in CareerServiceImpl
    void updateMethod(String oldJobTitle, Career upCareer);
    void addCareer(Career newCareer);
    List<Career> getCareerList();
    void deleteAllCareer();
//    Boolean deleteCareer(String delCareer);
Boolean deleteCareer(int id);
//    Career searchCareer(String theCareer);
    Career searchCareer(int id);
}

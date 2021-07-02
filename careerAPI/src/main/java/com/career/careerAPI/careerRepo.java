package com.career.careerAPI;

import java.util.ArrayList;
import java.util.List;

public class careerRepo {

    List<Career> careerList = new ArrayList<>();

    static{
        Career softwareEngineer = new Career("Software Engineer", "Build App's,", 1000.00);
    }

    public List<Career> getCareerList() {
        return careerList;
    }

    public void addCareer(Career newCareer){
        careerList.add(newCareer);
    }

    public void deleteAllCareer(){
        careerList.clear();
    }

    public void deleteCareer(String delCareer){
        for(Career career : getCareerList()) {
            if (career.getJobTitle().equals(delCareer)) {
                careerList.remove(career);
            }
        }

    }

    public Career searchCareer(String theCareer){
       for(Career career : getCareerList()){
           if(career.getJobTitle().equals(theCareer)){
               return career;
           }
       }
    return null;
    }

}

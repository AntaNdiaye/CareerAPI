package com.career.careerAPI;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CareerRepo {

    static List<Career> careerList = new ArrayList<>();

    static{
        Career softwareEngineer = new Career("Software Engineer", "Build App's,", 1000.00);
        careerList.add(softwareEngineer);
    }

    public static List<Career> getCareerList() {
        return careerList;
    }

    public static void addCareer(Career newCareer){
        careerList.add(newCareer);
    }

    public static void deleteAllCareer(){
        careerList.clear();
    }

    public static Boolean deleteCareer(String delCareer){
        for(Career career : getCareerList()) {
            if (career.getJobTitle().equals(delCareer)) {
                return careerList.remove(career);
            }
        }
        return null ;
    }

    public static Career searchCareer(String theCareer){
       for(Career career : getCareerList()){
           if(career.getJobTitle().equals(theCareer)){
               return career;
           }
       }
    return null;
    }

}

package com.career.careerAPI;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CareerRepo implements CareerService{ //implements the career service class

    static List<Career> careerList = new ArrayList<>(); // creates a career type list

    static{
        // created a job type from the career method in career
        Career softwareEngineer = new Career("Software Engineer", "Build App's,", 1000.00);
        careerList.add(softwareEngineer);
    }

    @Override
    public  void updateMethod(String oldJobTitle, Career upCareer){
        String newDescription = upCareer.getJobDescription(); //string var to get the career job description
        Double newSalary = upCareer.getSalary(); //string var to get the career's new salary

        // To update the new Career
        for(Career career : getCareerList()){ // for each loop to get the career list
            if(career.getJobTitle().equals(oldJobTitle)){  //if both job titles are equal
                career.setJobDescription(newDescription); // sets the job description from the old description to the new
                career.setSalary(newSalary); // sets the job salary from the old salary to the new
                return;
            }
        }

    }
    @Override
    public  List<Career> getCareerList() {
        return careerList;
    }
    @Override
    public  void addCareer(Career newCareer){
        careerList.add(newCareer);
    }
    @Override
    public  void deleteAllCareer(){
        careerList.clear();
    }

    @Override
    public Boolean deleteCareer(String delCareer) { //Boolean Method to delete a Career
        for(Career career : getCareerList()) { // for each loop to get the career list
            if (career.getJobTitle().equals(delCareer)) { //if the job title is equalled to the parameter delCareer
                return careerList.remove(career); // will now return the career list with the career removed
            }
        }
        return null ;
    }

    @Override
    public Career searchCareer(String theCareer) { // SearchMethod to search for a career
        for(Career career : getCareerList()){ // for each method to get the careerList
            if(career.getJobTitle().equals(theCareer)){ //if the job title is equalled to the career in the parameter
                return career; // returns the career that is searched
            }
        }
        return null;
    }

}

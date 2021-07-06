package com.career.careerAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class CareerController {
        @Autowired
        Career_Repo careerRepo;

        public CareerController(Career_Repo careerRepo) {
            this.careerRepo = careerRepo;
        }


    @PutMapping("/Careers/{oldJobTitle}")
        public void updateCareer(@PathVariable String oldJobTitle ,@RequestBody Career upCareer){
            careerRepo.updateMethod(oldJobTitle,upCareer);
    }
    @GetMapping("/Careers")
        public List<Career> allCareers() {
            return careerRepo.getCareerList();
        }

        @GetMapping("/Careers/{theCareer}")
        public Career searchCareers(@PathVariable String theCareer) {
            return careerRepo.searchCareer(theCareer);
        }

        @PostMapping("/Career")
        public void addCareer(@RequestBody Career newcareer) {
            careerRepo.addCareer(newcareer);
        }

        @DeleteMapping("/Careers")
        public void deleteAllCareer() {
            careerRepo.deleteAllCareer();
        }
        @DeleteMapping("/Careers/{id}")
        public Boolean deleteCareer(@PathVariable String delCareer) {
            return careerRepo.deleteCareer(delCareer);
    }


}



package com.career.careerAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class CareerController {
        @Autowired
        CareerRepo careerRepo ;

        public CareerController(CareerRepo careerRepo) {
            this.careerRepo = careerRepo;
        }
    @PutMapping("/Careers/{delCareer}")
        public void updateCareer(){
            
    }
    @GetMapping("/Careers")
        public List<Career> allCareers() {
            return CareerRepo.getCareerList();
        }

        @GetMapping("/Careers/{theCareer}")
        public Career searchCareers(@PathVariable String theCareer) {
            return CareerRepo.searchCareer(theCareer);
        }

        @PostMapping("/Career")
        public void addCareer(@RequestBody Career newcareer) {
            CareerRepo.addCareer(newcareer);

        }

        @DeleteMapping("/Careers")
        public void deleteAllCareer() {
            CareerRepo.deleteAllCareer();
        }
        @DeleteMapping("/Careers/{delCareer}")
        public Boolean deleteCareer(@PathVariable String delCareer) {
            return CareerRepo.deleteCareer(delCareer);
    }


}



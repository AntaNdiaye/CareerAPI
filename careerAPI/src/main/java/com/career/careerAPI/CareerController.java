package com.career.careerAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class CareerController {
        @Autowired
        CareerService careerService;

        public CareerController(CareerService careerService) {
            this.careerService = careerService;
        }


    @PutMapping("/Careers/{oldJobTitle}")
        public void updateCareer(@PathVariable String oldJobTitle ,@RequestBody Career upCareer){
            careerService.updateMethod(oldJobTitle,upCareer);
    }
    @GetMapping("/Careers")
        public List<Career> allCareers() {
            return careerService.getCareerList();
        }

        @GetMapping("/Careers/{theCareer}")
        public Career searchCareers(@PathVariable String theCareer) {
            return careerService.searchCareer(theCareer);
        }

        @PostMapping("/Career")
        public void addCareer(@RequestBody Career newcareer) {
            careerService.addCareer(newcareer);
        }

        @DeleteMapping("/Careers")
        public void deleteAllCareer() {
            careerService.deleteAllCareer();
        }
        @DeleteMapping("/Careers/{delCareer}")
        public Boolean deleteCareer(@PathVariable String delCareer) {
            return careerService.deleteCareer(delCareer);
    }


}



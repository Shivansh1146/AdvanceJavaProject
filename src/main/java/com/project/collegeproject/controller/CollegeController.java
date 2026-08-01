package com.project.collegeproject.controller;

import com.project.collegeproject.model.CollegeEntity;
import com.project.collegeproject.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CollegeController {
    @Autowired
    private CollegeService collegeService;

    @GetMapping("/getAllColleges")
    public ResponseEntity<List<CollegeEntity>> getAllColleges() {
        return ResponseEntity.ok(collegeService.getAllColleges());
    }

    @GetMapping("/getCollegeByCode/{collegeCode}")
    public ResponseEntity<CollegeEntity> getCollegeByCode(@PathVariable String collegeCode) {
        return ResponseEntity.ok(collegeService.getCollegeByCode(collegeCode));
    }

    @GetMapping("/getCollegeByName")
    public ResponseEntity<CollegeEntity> getCollegeByName(@RequestBody String collegeName) {
        return ResponseEntity.ok(collegeService.getCollegeByName(collegeName));
    }

    @GetMapping("/getCollegeByEmail/{collegeEmail}")
    public ResponseEntity<CollegeEntity> getCollegeByEmail(@PathVariable String collegeEmail) {
        return ResponseEntity.ok(collegeService.getCollegeByEmail(collegeEmail));
    }

    @GetMapping("/getCollegeByPhoneNumber")
    public ResponseEntity<CollegeEntity> getCollegeByPhoneNumber(@RequestBody String collegePhoneNumber) {
        return ResponseEntity.ok(collegeService.getCollegeByPhoneNumber(collegePhoneNumber));
    }

    @GetMapping("/getCollegeByAddress/{collegeAddress}")
    public ResponseEntity<CollegeEntity> getCollegeByAddress(@PathVariable String collegeAddress) {
        return ResponseEntity.ok(collegeService.getCollegeByAddress(collegeAddress));
    }


    @PostMapping("/addCollege")
    public ResponseEntity<String> addCollege(@RequestBody CollegeEntity collegeEntity) {
        return ResponseEntity.status(201).body(collegeService.addCollege(collegeEntity));
    }
}

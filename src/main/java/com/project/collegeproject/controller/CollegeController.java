package com.project.collegeproject.controller;

import com.project.collegeproject.enums.Status;
import com.project.collegeproject.enums.Type;
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
    public ResponseEntity<List<CollegeEntity>> getCollegeByCode(@PathVariable String collegeCode) {
        return ResponseEntity.ok(collegeService.getCollegeByCode(collegeCode));
    }

    @GetMapping("/getCollegeByName")
    public ResponseEntity<List<CollegeEntity>> getCollegeByName(@RequestParam String collegeName) {
        return ResponseEntity.ok(collegeService.getCollegeByName(collegeName));
    }

    @GetMapping("/getCollegeByEmail/{collegeEmail}")
    public ResponseEntity<List<CollegeEntity>> getCollegeByEmail(@PathVariable String collegeEmail) {
        return ResponseEntity.ok(collegeService.getCollegeByEmail(collegeEmail));
    }

    @GetMapping("/getCollegeByPhoneNumber")
    public ResponseEntity<List<CollegeEntity>> getCollegeByPhoneNumber(@RequestParam String collegePhoneNumber) {
        return ResponseEntity.ok(collegeService.getCollegeByPhoneNumber(collegePhoneNumber));
    }

    @GetMapping("/getCollegeByAddress/{collegeAddress}")
    public ResponseEntity<List<CollegeEntity>> getCollegeByAddress(@PathVariable String collegeAddress) {
        return ResponseEntity.ok(collegeService.getCollegeByAddress(collegeAddress));
    }

    @GetMapping("/getCollegeByType")
    public ResponseEntity<List<CollegeEntity>> getCollegeByType(@RequestParam Type collegeType) {
        return ResponseEntity.ok(collegeService.getCollegeByType(collegeType));
    }

    @GetMapping("/getCollegeByStatus")
    public ResponseEntity<List<CollegeEntity>> getCollegeByStatus(@RequestParam Status collegeStatus) {
        return ResponseEntity.ok(collegeService.getCollegeByStatus(collegeStatus));
    }

    @PostMapping("/addCollege")
    public ResponseEntity<String> addCollege(@RequestBody CollegeEntity collegeEntity) {
        return ResponseEntity.status(201).body(collegeService.addCollege(collegeEntity));
    }
}

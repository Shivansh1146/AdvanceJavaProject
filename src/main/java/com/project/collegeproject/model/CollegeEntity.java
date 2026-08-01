package com.project.collegeproject.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "college_table")

public class CollegeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String collegeCode;
    private String collegeName;
    private String collegeEmail;
    private String collegePhoneNumber;
    private String collegeAddress;
    private Date StartDate;

}

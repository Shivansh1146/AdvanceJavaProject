package com.project.collegeproject.model;


import com.project.collegeproject.enums.Status;
import com.project.collegeproject.enums.Type;
import jakarta.persistence.*;
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
    @Enumerated(value = EnumType.STRING)
    private Type collegeType;
    @Enumerated(value = EnumType.STRING)
    private Status collegeStatus;
    private Date startDate;

}

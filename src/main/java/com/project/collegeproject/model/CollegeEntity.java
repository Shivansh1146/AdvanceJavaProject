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

    @Column(nullable = false)
    private String collegeCode;

    @Column(nullable = false)
    private String collegeName;

    @Column(nullable = false)
    private String collegeEmail;

    @Column(nullable = false)
    private String collegePhoneNumber;

    @Column(nullable = false)
    private String collegeAddress;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Type collegeType;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Status collegeStatus;

    private Date startDate;
}

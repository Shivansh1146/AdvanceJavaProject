package com.project.collegeproject.repository;

import com.project.collegeproject.model.CollegeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepository extends JpaRepository<CollegeEntity, String> {
    CollegeEntity findByCollegeCode(String collegeCode);

    CollegeEntity findByCollegeName(String collegeName);

    CollegeEntity findByCollegeEmail(String collegeEmail);

    CollegeEntity findByCollegePhoneNumber(String collegePhoneNumber);

    CollegeEntity findByCollegeAddress(String collegeAddress);
}

package com.project.collegeproject.repository;

import com.project.collegeproject.enums.Status;
import com.project.collegeproject.enums.Type;
import com.project.collegeproject.model.CollegeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollegeRepository extends JpaRepository<CollegeEntity, String> {
    List<CollegeEntity> findByCollegeCode(String collegeCode);

    List<CollegeEntity> findByCollegeName(String collegeName);

    List<CollegeEntity> findByCollegeEmail(String collegeEmail);

    List<CollegeEntity> findByCollegePhoneNumber(String collegePhoneNumber);

    List<CollegeEntity> findByCollegeAddress(String collegeAddress);

    List<CollegeEntity> findByCollegeType(Type collegeType);

    List<CollegeEntity> findByCollegeStatus(Status collegeStatus);
}

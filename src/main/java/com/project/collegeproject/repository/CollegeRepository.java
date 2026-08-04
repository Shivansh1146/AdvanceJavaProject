package com.project.collegeproject.repository;

import com.project.collegeproject.enums.Status;
import com.project.collegeproject.enums.Type;
import com.project.collegeproject.model.CollegeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CollegeRepository extends JpaRepository<CollegeEntity, Long> {
    Optional<CollegeEntity> findByCollegeCode(String collegeCode);

    List<CollegeEntity> findByCollegeName(String collegeName);

    Optional<CollegeEntity> findByCollegeEmail(String collegeEmail);

    Optional<CollegeEntity> findByCollegePhoneNumber(String collegePhoneNumber);

//    List<CollegeEntity> findByCollegeAddress(String address); useless now

    List<CollegeEntity> findByCollegeType(Type collegeType);

    List<CollegeEntity> findByCollegeStatus(Status collegeStatus);
}

package com.project.collegeproject.service;

import com.project.collegeproject.enums.Status;
import com.project.collegeproject.enums.Type;
import com.project.collegeproject.model.CollegeEntity;
import com.project.collegeproject.repository.CollegeRepository;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CollegeService {
    @Autowired
    private CollegeRepository collegeRepository;

    public List<CollegeEntity> getAllColleges() {
        return collegeRepository.findAll();
    }

    public Optional<CollegeEntity> getCollegeByCode(String collegeCode) {
        if (StringUtils.isBlank(collegeCode)) {
            return Optional.empty();
        }
        return collegeRepository.findByCollegeCode(collegeCode);
    }

    public List<CollegeEntity> getCollegeByName(String collegeName) {
        if (StringUtils.isBlank(collegeName)) {
            return null;
        }
        return collegeRepository.findByCollegeName(collegeName);
    }

    public Optional<CollegeEntity> getCollegeByEmail(String collegeEmail) {
        if (StringUtils.isBlank(collegeEmail)) {
            return Optional.empty();
        }
        return collegeRepository.findByCollegeEmail(collegeEmail);
    }

    public Optional<CollegeEntity> getCollegeByPhoneNumber(String collegePhoneNumber) {
        if (StringUtils.isBlank(collegePhoneNumber)) {
            return Optional.empty();
        }
        return collegeRepository.findByCollegePhoneNumber(collegePhoneNumber);
    }

    public List<CollegeEntity> getCollegeByAddress(String collegeAddress) {
        if (StringUtils.isBlank(collegeAddress)) {
            return null;
        }
        return collegeRepository.findByCollegeAddress(collegeAddress);
    }

    public List<CollegeEntity> getCollegeByType(Type collegeType) {
        if (ObjectUtils.isEmpty(collegeType)) {
            return null;
        }
        return collegeRepository.findByCollegeType(collegeType);
    }

    public List<CollegeEntity> getCollegeByStatus(Status collegeStatus) {
        if (ObjectUtils.isEmpty(collegeStatus)) {
            return null;
        }
        return collegeRepository.findByCollegeStatus(collegeStatus);
    }

    public String addCollege(CollegeEntity collegeEntity) {
        if (ObjectUtils.isEmpty(collegeEntity)) {
            return "Invalid College";
        }
        if (StringUtils.isBlank(collegeEntity.getCollegeCode()) || !collegeEntity.getCollegeCode().matches("^[a-zA-Z0-9]+$")) {
            return "Invalid College Code";
        }
        if (collegeRepository.findByCollegeCode(collegeEntity.getCollegeCode()).isPresent()) {
            return "College Code  Already Exists";
        }
        if (StringUtils.isBlank(collegeEntity.getCollegeName()) || !collegeEntity.getCollegeName().matches("^[a-zA-Z ]+$")) {
            return "Invalid College Name";
        }
        if (StringUtils.isBlank(collegeEntity.getCollegeEmail()) || !collegeEntity.getCollegeEmail().matches("^[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]{2,}$")) {
            return "Invalid College Email";
        }
        if (collegeRepository.findByCollegeEmail(collegeEntity.getCollegeEmail()).isPresent()) {
            return "College Email  Already Exists";
        }
        if (StringUtils.isBlank(collegeEntity.getCollegePhoneNumber()) || !collegeEntity.getCollegePhoneNumber().matches("^[6-9][0-9]{9}$")) {
            return "Invalid College Phone Number";
        }
        if (collegeRepository.findByCollegePhoneNumber(collegeEntity.getCollegePhoneNumber()).isPresent()) {
            return "College Phone Number Already Exists";
        }
        if (StringUtils.isBlank(collegeEntity.getCollegeAddress()) || !collegeEntity.getCollegeAddress().matches("^[a-zA-Z0-9 ]+$")) {
            return "Invalid College Address";
        }
        if (ObjectUtils.isEmpty(collegeEntity.getCollegeType())) {
            return "Invalid College Type";
        }
        if (ObjectUtils.isEmpty(collegeEntity.getCollegeStatus())) {
            return "Invalid College Status";
        }
        collegeEntity.setStartDate(new Date());
        collegeRepository.save(collegeEntity);
        return "Congrats !! Your College is saved";
    }
}

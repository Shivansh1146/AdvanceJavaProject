package com.project.collegeproject.service;

import com.project.collegeproject.model.CollegeEntity;
import com.project.collegeproject.repository.CollegeRepository;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CollegeService {
    @Autowired
    private CollegeRepository collegeRepository;

    public List<CollegeEntity> getAllColleges() {
        return collegeRepository.findAll();
    }

    public List<CollegeEntity> getCollegeByCode(String collegeCode) {
        if (StringUtils.isBlank(collegeCode)) {
            return null;
        }
        return collegeRepository.findByCollegeCode(collegeCode);
    }

    public List<CollegeEntity> getCollegeByName(String collegeName) {
        if (StringUtils.isBlank(collegeName)) {
            return null;
        }
        return collegeRepository.findByCollegeName(collegeName);
    }

    public List<CollegeEntity> getCollegeByEmail(String collegeEmail) {
        if (StringUtils.isBlank(collegeEmail)) {
            return null;
        }
        return collegeRepository.findByCollegeEmail(collegeEmail);
    }

    public List<CollegeEntity> getCollegeByPhoneNumber(String collegePhoneNumber) {
        if (StringUtils.isBlank(collegePhoneNumber)) {
            return null;
        }
        return collegeRepository.findByCollegePhoneNumber(collegePhoneNumber);
    }

    public List<CollegeEntity> getCollegeByAddress(String collegeAddress) {
        if (StringUtils.isBlank(collegeAddress)) {
            return null;
        }
        return collegeRepository.findByCollegeAddress(collegeAddress);
    }

    public String addCollege(CollegeEntity collegeEntity) {
        if (StringUtils.isBlank(collegeEntity.getCollegeCode()) || !collegeEntity.getCollegeCode().matches("^[a-zA-Z0-9]+$")) {
            return "Invalid College Code";
        }
        if (StringUtils.isBlank(collegeEntity.getCollegeName()) || !collegeEntity.getCollegeName().matches("^[a-zA-Z ]+$")) {
            return "Invalid College Name";
        }
        if (StringUtils.isBlank(collegeEntity.getCollegeEmail()) || !collegeEntity.getCollegeEmail().matches("^[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]{2,}$")) {
            return "Invalid College Email";
        }
        if (StringUtils.isBlank(collegeEntity.getCollegePhoneNumber()) || !collegeEntity.getCollegePhoneNumber().matches("^[6-9][0-9]{9}$")) {
            return "Invalid College Phone Number";
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
        if (ObjectUtils.isEmpty(collegeEntity)) {
            return "Invalid College";
        }
        collegeEntity.setStartDate(new Date());
        collegeRepository.save(collegeEntity);
        return "Congrats !! Your College  is saved";
    }
}

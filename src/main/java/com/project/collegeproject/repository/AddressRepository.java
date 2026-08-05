package com.project.collegeproject.repository;

import com.project.collegeproject.model.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Long> {
}

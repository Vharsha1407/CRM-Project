package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.CmsEntity;

public interface CmsRepository extends JpaRepository<CmsEntity,Long> {

}

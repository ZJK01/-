package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.demo.entity.Matter;

public interface MatterDao  extends JpaRepository<Matter,Integer>,JpaSpecificationExecutor<Matter>{

}

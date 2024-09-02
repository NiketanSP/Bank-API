package com.xoriant.bank.managerservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xoriant.bank.managerservice.entities.Manager;

public interface ManagerServiceDao extends JpaRepository<Manager, Integer> {
	
	

}

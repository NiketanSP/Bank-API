package com.xoriant.bank.managerservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.bank.managerservice.dao.ManagerServiceDao;
import com.xoriant.bank.managerservice.entities.Manager;

@Service
public class ManagerServiceImpl {
	
	@Autowired
	private ManagerServiceDao serviceDao;
	
	public List<Manager> findAll() {
		return serviceDao.findAll();
	}
	
	public Manager findById(int personalInfoId) {
		return serviceDao.findById(personalInfoId).get();

	}
	
}

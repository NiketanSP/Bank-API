package com.xoriant.bank.accountservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xoriant.bank.accountservice.entities.CurrentAccount;

public interface CurrentAccountServiceDao extends JpaRepository<CurrentAccount,Long>{

}

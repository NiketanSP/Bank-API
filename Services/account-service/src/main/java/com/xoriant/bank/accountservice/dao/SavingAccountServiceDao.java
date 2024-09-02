package com.xoriant.bank.accountservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xoriant.bank.accountservice.entities.SavingAccount;

public interface SavingAccountServiceDao extends JpaRepository<SavingAccount,Long>{



}

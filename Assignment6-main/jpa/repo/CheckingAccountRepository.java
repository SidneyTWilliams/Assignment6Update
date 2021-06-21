package com.MeritBankAppjpa.jpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MeritBankAppjpa.jpa.model.AccountHolder;
import com.MeritBankAppjpa.jpa.model.CheckingAccount;


public interface CheckingAccountRepository extends JpaRepository<CheckingAccount, Integer>{

	
}
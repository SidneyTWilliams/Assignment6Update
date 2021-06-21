package com.MeritBankAppjpa.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MeritBankAppjpa.jpa.model.AccountHolder;
import com.MeritBankAppjpa.jpa.model.CDAccount;

public interface CDAccountRepository extends JpaRepository<CDAccount, Integer>{

	static void save(AccountHolder ah) {
		
		
	}
	
}
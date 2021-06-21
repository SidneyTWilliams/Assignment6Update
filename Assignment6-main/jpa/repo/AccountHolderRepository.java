package com.MeritBankAppjpa.jpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MeritBankAppjpa.jpa.model.AccountHolder;

public interface AccountHolderRepository extends JpaRepository<AccountHolder, Integer>{

	List<AccountHolder> findByFirstName(String firstName);
}

package com.MeritBankAppjpa.jpa.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MeritBankAppjpa.jpa.model.AccountHolder;
import com.MeritBankAppjpa.jpa.repo.AccountHolderRepository;

@RestController
@RequestMapping("/test")
public class AccountHolderResource {

	@Autowired
	AccountHolderRepository accountHolderRepository;
	
   
    @PostMapping("/addAccountHolder")
    public AccountHolder addAccountHolder(@RequestBody AccountHolder accountHolder) {
    	accountHolderRepository.save(accountHolder);
    	return accountHolder;
    }


    @GetMapping("/id/{id}")
    public AccountHolder getId(@PathVariable("id") final Integer id) {
        return accountHolderRepository.findById(id).orElse(null);
    }

    @GetMapping("/update/{id}/{firstName}")
    public AccountHolder update(@PathVariable("id") final Integer id, @PathVariable("firstName")
                         final String firstName) {


    	AccountHolder accountHolder = getId(id);
    	accountHolder.setFirstName(firstName);

        return accountHolderRepository.save(accountHolder);
    }
}





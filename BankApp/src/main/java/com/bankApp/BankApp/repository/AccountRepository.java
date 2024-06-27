package com.bankApp.BankApp.repository;

import com.bankApp.BankApp.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}


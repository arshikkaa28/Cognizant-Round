package com.cognizant.account.controller;

import com.cognizant.account.model.Account;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{number}")
    public Account getAccount(@PathVariable String number) {

        Account account = new Account();

        account.setNumber(number);
        account.setType("savings");
        account.setBalance(234343);

        return account;
    }
}
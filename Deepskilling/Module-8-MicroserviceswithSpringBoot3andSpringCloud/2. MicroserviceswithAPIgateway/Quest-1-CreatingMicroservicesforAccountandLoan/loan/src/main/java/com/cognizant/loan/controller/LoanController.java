package com.cognizant.loan.controller;

import com.cognizant.loan.model.Loan;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loans")
public class LoanController {


    @GetMapping("/{number}")
    public Loan getLoan(@PathVariable String number) {

        Loan loan = new Loan();

        loan.setNumber(number);
        loan.setType("car");
        loan.setLoan(400000);
        loan.setEmi(3258);
        loan.setTenure(18);

        return loan;
    }
}
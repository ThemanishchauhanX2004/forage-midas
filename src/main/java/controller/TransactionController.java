package com.jpmc.midascore.controller;

import com.jpmc.midascore.foundation.Transaction;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private final List<Transaction> transactionList = new ArrayList<>();

    @GetMapping
    public List<Transaction> getAll() {
        return transactionList;
    }

    @PostMapping
    public Transaction create(@RequestBody Transaction tx) {
        tx.setStatus("PENDING");
        transactionList.add(tx);
        return tx;
    }
}

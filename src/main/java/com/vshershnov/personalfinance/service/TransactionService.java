package com.vshershnov.personalfinance.service;

import com.vshershnov.personalfinance.domain.CardStatExpance;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TransactionService {

    List<CardStatExpance> getTransactions ();
}

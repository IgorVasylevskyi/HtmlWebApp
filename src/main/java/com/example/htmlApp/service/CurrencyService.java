package com.example.htmlApp.service;

import com.example.htmlApp.model.Currency;

import java.util.List;

public interface CurrencyService {

    Currency addCurrency(Currency currency);
    List<Currency> getAll();
    Currency getLast();
    List<Currency> getLastWeek();

}
package com.example.htmlApp.controller;

import com.example.htmlApp.model.Currency;
import com.example.htmlApp.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class HtmlController {

    @Autowired
    CurrencyService currencyService;

    @GetMapping
    public String mainPage(){
        return "mainpage";
    }


    @GetMapping(value = "/get_today_currency")
    public String getPage(Currency currency, Map<String, Object> model){

        currencyService.addCurrency(currency);

        model.put("get", currencyService.getLast());

        return "getTodayCurrency";
    }

    @GetMapping(value = "/get_all_rates")
    public String allRates(Map<String, Object> model){

        model.put("all", currencyService.getAll());

        return "getAll";
    }


}

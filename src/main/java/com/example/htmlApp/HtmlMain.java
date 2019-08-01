package com.example.htmlApp;

import com.example.htmlApp.connection.ConnectionToApi;
import org.json.JSONException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.text.ParseException;

@SpringBootApplication
public class HtmlMain {
    public static void main(String[] args) throws JSONException, ParseException, IOException {
        ConnectionToApi.connection();
        SpringApplication.run(HtmlMain.class, args);
    }
}

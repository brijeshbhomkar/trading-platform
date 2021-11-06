package com.trading.platform.controller;

import com.trading.platform.repository.SymbolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/symbol")
public class SymbolController {

    @Autowired
    private SymbolRepository repository;

    @GetMapping("/test")
    public String test() {
        return HttpStatus.OK.toString();
    }
}

package com.ft.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRest {

    @GetMapping("/message")
    public String getMessage(){
        return "Hello worlod";
    }
}

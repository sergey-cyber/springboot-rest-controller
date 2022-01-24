package com.myapps.organizer.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MainController {

    @RequestMapping("/home")
    public Map<String, String> home(@RequestParam Map<String,String> searchParams) {
        String name = searchParams.get("name");
        return Map.of("name", name);
    }

}

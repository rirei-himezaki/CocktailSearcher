package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Fortune {

  @RequestMapping("/cocktailSearcher")
  public String start() {
      return "mainMenu.html";
    }
  }

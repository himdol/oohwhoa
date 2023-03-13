package com.oohwhoa.oohwhoa.controller.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller("/")
public class HomeController {

  @GetMapping(value = "/")
  public String goHome(HttpServletRequest request) {
    return "index";
  }

  @GetMapping(value = "/home2")
  public String goHome2(HttpServletRequest request) {
    return "contents/home2";
  }
}

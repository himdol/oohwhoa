package com.oohwhoa.oohwhoa.controller.index;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

//  public String showIndexPage() {
//    return "/";
//  }
    @GetMapping(value = "/home")
    public String goHome(HttpServletRequest request) {
      return "contents/home";
    }
    @GetMapping(value = "/home2")
    public String goHome2(HttpServletRequest request) {
      return "contents/home2";
    }
}

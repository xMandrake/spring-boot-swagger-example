package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
    @RequestMapping(value = "/")
    public RedirectView index(HttpServletRequest request) {
        return new RedirectView(request.getRequestURI() + "swagger-ui.html");
    }
}
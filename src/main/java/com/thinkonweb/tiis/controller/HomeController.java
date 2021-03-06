package com.thinkonweb.tiis.controller;

import com.thinkonweb.tiis.mapper.ManuscriptMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private ManuscriptMapper manuscriptMapper;

    @RequestMapping("/")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", manuscriptMapper.test());

        return "greeting";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}

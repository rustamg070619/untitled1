package jm.controller;

import jm.mailservice.MailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleEmailExampleController {

    @Autowired
    public MailServiceImpl mailService;

    @ResponseBody
    @RequestMapping("/sendSimpleEmail")
    public String sendSimpleEmail() {

    mailService.sendSimpleMessage("java.mentor.jp@gmail.com", "Тема письма", "Текст письма");

        return "Email Sent!";
    }

}


package com.lxj.thymeleaf.demo.controller;

import com.lxj.thymeleaf.demo.domain.Account;
import com.lxj.thymeleaf.demo.service.AccountService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class IndexController {
    @Resource
    public AccountService accountService;

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("msg", "Hello Thymeleaf!");
        model.addAttribute("title", "Hellothymeleaf!");
        return "index";
    }

    @GetMapping("/account")
    public String account(Model model) {
        List<Account> accounts =
                accountService.selectAccount();
        model.addAttribute("accounts", accounts);
        return "account";
    }
}

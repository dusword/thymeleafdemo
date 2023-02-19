package com.lxj.thymeleaf.demo;

import com.lxj.thymeleaf.demo.domain.Account;
import com.lxj.thymeleaf.demo.mapper.AccountMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SampleTest {
    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void test() {
        System.out.println("print select from account");
        List<Account> accounts = accountMapper.selectList(null);
        accounts.forEach(System.out::println);
    }
}

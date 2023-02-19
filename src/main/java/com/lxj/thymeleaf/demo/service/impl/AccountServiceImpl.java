package com.lxj.thymeleaf.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lxj.thymeleaf.demo.domain.Account;
import com.lxj.thymeleaf.demo.mapper.AccountMapper;
import com.lxj.thymeleaf.demo.service.AccountService;
import org.springframework.stereotype.Service;

/**
* @author A
* @description 针对表【account(账户表)】的数据库操作Service实现
* @createDate 2023-02-19 15:38:31
*/
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account>
    implements AccountService {

}





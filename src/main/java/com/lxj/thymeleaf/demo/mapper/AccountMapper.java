package com.lxj.thymeleaf.demo.mapper;

import com.lxj.thymeleaf.demo.domain.Account;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
* @author A
* @description 针对表【account(账户表)】的数据库操作Mapper
* @createDate 2023-02-19 15:38:31
* @Entity domain.com.lxj.thymeleaf.demo.Account
*/
@Mapper
@Component
public interface AccountMapper extends BaseMapper<Account> {

}





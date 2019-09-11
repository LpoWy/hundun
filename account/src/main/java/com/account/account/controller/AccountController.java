package com.account.account.controller;

import com.account.account.entity.Account;
import com.account.account.service.IAccountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ******************************************************************************************************************
 * CreateDate             Author             TaskManage             Descriptions
 * 2019-08-28              @author LP           后台管理模块设计           积分controller
 * ******************************************************************************************************************
 */
@RestController
@AllArgsConstructor
@RequestMapping("account")
public class AccountController {
    private IAccountService accountService;
    @GetMapping("/getAccountList")
    public List<Account> getAccount() {
        List<Account> accounts = accountService.getAccountList();
        return accounts;
    }

    @GetMapping("/saveAccount")
    public Integer saveAccount() {
        Account account = new Account();
        Integer accounts = accountService.saveAccount(account);
        return accounts;
    }

    @GetMapping("/updateAccount")
    public Integer updateAccount() {
        Account account = new Account();
        Integer accounts = accountService.updateAccount(account);
        return accounts;
    }
}

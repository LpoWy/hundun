package com.account.account.service.impl;

import com.account.account.entity.Account;
import com.account.account.mapper.AccountMapper;
import com.account.account.service.IAccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ******************************************************************************************************************
 * CreateDate             Author             TaskManage             Descriptions
 * 2019-08-28              @author LP           后台管理模块设计           积分controller
 * ******************************************************************************************************************
 */
@Service
@AllArgsConstructor
public class AccountServiceImpl implements IAccountService {

    private AccountMapper accountMapper;

    @Override
    public List<Account> getAccountList() {
        return accountMapper.getAccountList();
    }

    @Override
    public Integer saveAccount(Account account) {
        return accountMapper.saveAccount(account);
    }

    @Override
    public Integer updateAccount(Account account) {
        return accountMapper.updateAccount(account);
    }
}

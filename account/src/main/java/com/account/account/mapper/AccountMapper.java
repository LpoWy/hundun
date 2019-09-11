package com.account.account.mapper;

import com.account.account.entity.Account;

import java.util.List;

/**
 * ******************************************************************************************************************
 * CreateDate             Author             TaskManage             Descriptions
 * 2019-08-28              @author LP           后台管理模块设计           积分controller
 * ******************************************************************************************************************
 */
public interface AccountMapper {
    List<Account> getAccountList();

    Integer saveAccount(Account account);

    Integer updateAccount(Account account);
}

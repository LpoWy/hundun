package com.account.account;

import com.account.account.entity.Account;
import com.account.account.service.IAccountService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Before
    public void before(){
        System.out.println("测试开始");
    }
    @After
    public void after(){
        System.out.println("测试结束");
    }

    @Autowired
    private IAccountService accountService;

    @Test
    public void saveAccount(){
        Account account = new Account();
        account.setAccount("小面份");
        account.setAccountNum("3");
        account.setAmount(5);
        account.setCreateTime(LocalDateTime.now());
        account.setType("食品");
        accountService.saveAccount(account);
    }

    @Test
    public void updateAccount(){
        Account account = new Account();
        account.setId(1);
        account.setAccount("花椒粉");
        account.setAccountNum("1");
        account.setAmount(5);
        account.setCreateTime(LocalDateTime.now());
        account.setType("食品");
        accountService.updateAccount(account);
    }


    @Test
    public void getAccountList(){
        List<Account> account = accountService.getAccountList();
        System.out.println(account);
    }
}

package com.lllfff;

import com.lllfff.model.User;
import com.lllfff.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Consumer implements CommandLineRunner {
    @Reference
    private UserService userService;
    @Override
    public void run(String... args) throws Exception {
        User user=userService.selectById(2);
        System.out.print(user);
    }
}

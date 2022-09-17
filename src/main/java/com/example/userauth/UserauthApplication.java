package com.example.userauth;

import com.example.userauth.domains.appuser;
import com.example.userauth.domains.role;
import com.example.userauth.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


import java.util.ArrayList;

@SpringBootApplication

public class UserauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserauthApplication.class, args);

    }


    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
    CommandLineRunner run(UserService userService){
        return args -> {
            userService.saveRole(new role(null,"ROLE_USER"));
            userService.saveRole(new role(null,"ROLE_MANAGER"));
            userService.saveRole(new role(null,"ROLE_ADMIN"));
            userService.saveRole(new role(null,"ROLE_SUPER_ADMIN"));

            userService.saveUser(new appuser(null, "John Travolta", "john", "1234", new ArrayList<>()));
            userService.saveUser(new appuser(null, "Will Smith", "will", "1234", new ArrayList<>()));
            userService.saveUser(new appuser(null, "Jim Carry", "jim", "1234", new ArrayList<>()));
            userService.saveUser(new appuser(null, "Arnold Schwarzenegger", "arnold", "1234", new ArrayList<>()));

            userService.addRoleToUser("john", "ROLE_USER");
            userService.addRoleToUser("john", "ROLE_MANAGER");
            userService.addRoleToUser("will", "ROLE_MANAGER");
            userService.addRoleToUser("jim", "ROLE_ADMIN");
            userService.addRoleToUser("arnold", "ROLE_SUPER_ADMIN");
            userService.addRoleToUser("arnold", "ROLE_ADMIN");
            userService.addRoleToUser("arnold", "ROLE_USER");
    };


    }


}

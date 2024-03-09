package com.fabio2g.snaporder.config;

import com.fabio2g.snaporder.entities.User;
import com.fabio2g.snaporder.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "John Doe", "john@example.com", "88888888", "12345");
        User user2 = new User(null, "Jane Smith", "jane@example.com", "99999999", "67890");
        User user3 = new User(null, "Bob Johnson", "bob@example.com", "77777777", "54321");
        User user4 = new User(null, "Alice Brown", "alice@example.com", "66666666", "98765");
        User user5 = new User(null, "Charlie Wilson", "charlie@example.com", "55555555", "112233");
        User user6 = new User(null, "Eva Rodriguez", "eva@example.com", "44444444", "67890");
        User user7 = new User(null, "Michael Smith", "michael@example.com", "33333333", "54321");
        User user8 = new User(null, "Sophia Wang", "sophia@example.com", "22222222", "98765");
        User user9 = new User(null, "Gabriel Martinez", "gabriel@example.com", "11111111", "112233");
        User user10 = new User(null, "Isabella Lee", "isabella@example.com", "99999999", "12345");

        userRepository.saveAll(Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10));
    }
}

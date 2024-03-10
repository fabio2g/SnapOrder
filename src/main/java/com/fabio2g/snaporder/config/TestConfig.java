package com.fabio2g.snaporder.config;

import com.fabio2g.snaporder.entities.Order;
import com.fabio2g.snaporder.entities.User;
import com.fabio2g.snaporder.entities.enums.OrderStatus;
import com.fabio2g.snaporder.repositories.OrderRepository;
import com.fabio2g.snaporder.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

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

        Order order1 = new Order(null, Instant.now(), OrderStatus.WAITING_PAYMENT, user1);
        Order order2 = new Order(null, Instant.now(), OrderStatus.CANCELED, user2);
        Order order3 = new Order(null, Instant.now(), OrderStatus.DELIVERED, user3);
        Order order4 = new Order(null, Instant.now(), OrderStatus.SHIPPED, user4);
        Order order5 = new Order(null, Instant.now(), OrderStatus.WAITING_PAYMENT, user5);
        Order order6 = new Order(null, Instant.now(), OrderStatus.SHIPPED, user6);
        Order order7 = new Order(null, Instant.now(), OrderStatus.CANCELED, user7);
        Order order8 = new Order(null, Instant.now(), OrderStatus.PAID, user8);
        Order order9 = new Order(null, Instant.now(), OrderStatus.WAITING_PAYMENT, user9);
        Order order10 = new Order(null, Instant.now(), OrderStatus.PAID, user10);

        userRepository.saveAll(Arrays.asList(user1, user2, user3, user4, user5,
                user6, user7, user8, user9, user10));

        orderRepository.saveAll(Arrays.asList(order1, order2, order3, order4, order5,
                order6, order7, order8, order9, order10));
    }
}

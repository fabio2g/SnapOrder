package com.fabio2g.snaporder.config;

import com.fabio2g.snaporder.entities.*;
import com.fabio2g.snaporder.entities.enums.OrderStatus;
import com.fabio2g.snaporder.repositories.*;
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

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

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

        userRepository.saveAll(Arrays.asList(user1, user2, user3, user4, user5,
                user6, user7, user8, user9, user10));

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

        orderRepository.saveAll(Arrays.asList(order1, order2, order3, order4, order5,
                order6, order7, order8, order9, order10));


        Category category1 = new Category(null, "Electronic");
        Category category2 = new Category(null, "Books");
        Category category3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(category1, category2, category3));

        Product product1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product product2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product product3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product product4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product product5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

        productRepository.saveAll(Arrays.asList(product1, product2, product3, product4, product5));

        product1.getCategories().add(category2);
        product2.getCategories().add(category1);
        product2.getCategories().add(category3);
        product3.getCategories().add(category3);
        product4.getCategories().add(category3);
        product5.getCategories().add(category2);

        productRepository.saveAll(Arrays.asList(product1, product2, product3, product4, product5));

        OrderItem orderItem1 = new OrderItem(order1, product1, 2, product1.getPrice());
        OrderItem orderItem2 = new OrderItem(order1, product3, 1, product4.getPrice());
        OrderItem orderItem3 = new OrderItem(order2, product3, 2, product1.getPrice());
        OrderItem orderItem4 = new OrderItem(order3, product5, 2, product5.getPrice());

        orderItemRepository.saveAll(Arrays.asList(orderItem1, orderItem2, orderItem3, orderItem4));
    }
}

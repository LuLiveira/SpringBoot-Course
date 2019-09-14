package com.lucasoliveira.course.config;

import com.lucasoliveira.course.entities.Category;
import com.lucasoliveira.course.entities.Order;
import com.lucasoliveira.course.entities.Product;
import com.lucasoliveira.course.entities.User;
import com.lucasoliveira.course.entities.enums.OrderStatus;
import com.lucasoliveira.course.repositories.CategoryRepository;
import com.lucasoliveira.course.repositories.OrderRepository;
import com.lucasoliveira.course.repositories.ProductRepository;
import com.lucasoliveira.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
        userRepository.saveAll(Arrays.asList(u1, u2));

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT,u1);
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

        Category cat1 = new Category(null, "Eletronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");
        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

        Product prod1 = new Product(null, "The lord of the rings", "Lorem ipsum", 90.5, "");
        Product prod2 = new Product(null, "SmartTV", "Lorem ipsum", 2190.0, "");
        Product prod3 = new Product(null, "Macbook Pro", "Lorem ipsum", 1250.0, "");
        Product prod4 = new Product(null, "PC Gamer", "Lorem ipsum", 1200.0, "");
        Product prod5 = new Product(null, "Rails for Dumct", "Lorem ipsum", 100.99, "");
        productRepository.saveAll(Arrays.asList(prod1, prod2, prod3, prod4, prod4, prod5));
    }
}

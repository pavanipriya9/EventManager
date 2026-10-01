package event_service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EventServiceApplication {

    List<Map<String, String>> users = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(EventServiceApplication.class, args);
    }

    @PostMapping("/register")
    public String register(@RequestBody Map<String, String> user) {
        users.add(user);
        return "Registration Successful!";
    }

    @GetMapping("/users")
    public List<Map<String, String>> getUsers() {
        return users;
    }
}
package com.example.plug;

import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class Controller {



 @GetMapping("/date")
    public Map<String, String> getStaticJson() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Static JSON");

        return response;
    }
    @PostMapping("/login")
    public User postLogin(@RequestParam String login, @RequestParam String password) {
        User user = new User();
        user.setLogin(login);
        user.setPassword(password);

        LocalDateTime currentDate = LocalDateTime.now();
        user.setDate(currentDate);

        return user;
    }
}

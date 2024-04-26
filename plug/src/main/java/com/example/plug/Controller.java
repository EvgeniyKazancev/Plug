package com.example.plug;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class Controller {




    @GetMapping("/date")
    public ResponseEntity<Map<String,String>> getStaticJson() {

        Map<String, String> response = new HashMap<>();
        response.put("message", "Static JSON");

        return ResponseEntity.ok(response);
    }

    @PostMapping("/login")
    public ResponseEntity<User> postLogin(@Valid @RequestBody User user) {

        user.setDate(LocalDateTime.now());

        return ResponseEntity.ok(user);
    }

}

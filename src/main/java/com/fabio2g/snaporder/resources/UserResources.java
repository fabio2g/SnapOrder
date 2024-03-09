package com.fabio2g.snaporder.resources;

import com.fabio2g.snaporder.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Jane", "jane@exemple.com", "99999999", "12345");
        return ResponseEntity.ok().body(user);
    }
}

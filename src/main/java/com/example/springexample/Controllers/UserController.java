package com.example.springexample.Controllers;

import com.example.springexample.Models.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
public class UserController {

    @PostMapping("/user")
    @ResponseBody
    public String postResponseController(@RequestBody User user) {
        return user.getEmail();
    }
}

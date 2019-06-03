package com.springbootmessage.message.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MessageController
 */

@RestController
public class MessageController {
        @GetMapping("/")
        public String sayHello() {
            return "May the force be with you!";
        }
}
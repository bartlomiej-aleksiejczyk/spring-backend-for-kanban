package com.example.springbackend.board;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo-controller")
public class BoardController {
    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Bajo jajo");
    }
}
